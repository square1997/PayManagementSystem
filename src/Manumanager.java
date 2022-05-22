import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class Manumanager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PayManager payManager = getObject("payManager.ser");
		if (payManager == null) {
			payManager = new PayManager(input);
		}
		selectMenu(input, payManager);
		putObject(payManager, "payManager.ser");
		}
	
	public static void showMenu() {
		System.out.println("1. Add Pay");
		System.out.println("2. Delete Pay");
		System.out.println("3. Edit Pay");
		System.out.println("4. View Pays");
		System.out.println("5. Exit");
		System.out.println("Select Menu between 1-5 : ");
	}
	
	public static void selectMenu(Scanner input, PayManager payManager) {
		int selectedMenuNum = 0;
		while (selectedMenuNum != 5) {
			try {
				showMenu();
				selectedMenuNum = input.nextInt();
				switch(selectedMenuNum) {
				case 1 :
					payManager.addpay();
					logger.log("add a Pay");
					break;
				case 2 :
					payManager.deletepay();
					logger.log("delete a Pay");
					break;
				case 3 :
					payManager.editpay();
					logger.log("edit a Pay");
					break;
				case 4 :
					payManager.viewpays();
					logger.log("view a Pay");
					break;
				case 5 :
					System.out.println("End the program.");
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1에서 5까지의 숫자를 입력해주세요");
				if (input.hasNext()) {
					input.next();
				}
				selectedMenuNum = -1;
			}
		}
	}
	
	public static PayManager getObject(String fileName) {
		PayManager payManager = null;
		
		try {
			FileInputStream file = new FileInputStream(fileName);
			ObjectInputStream in = new ObjectInputStream(file);
			
			payManager = (PayManager) in.readObject();
			
			in.close();
			file.close();
		} catch (FileNotFoundException e) {
			return payManager;
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return payManager;
	}
	
	public static void putObject(PayManager payManager, String fileName) {
		try {
			FileOutputStream file = new FileOutputStream(fileName);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(payManager);
			
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	}


