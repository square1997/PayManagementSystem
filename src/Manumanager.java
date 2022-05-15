import java.util.InputMismatchException;
import java.util.Scanner;

public class Manumanager {
	
	public static void showMenu() {
		System.out.println("1. Add Pay");
		System.out.println("2. Delete Pay");
		System.out.println("3. Edit Pay");
		System.out.println("4. View Pays");
		System.out.println("5. Exit");
		System.out.print("Select Menu between 1-5 : ");
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
					break;
				case 2 :
					payManager.deletepay();
					break;
				case 3 :
					payManager.editpay();
					break;
				case 4 :
					payManager.viewpays();
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
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		PayManager payManager = new PayManager(input);
		selectMenu(input, payManager);
		}

	}


