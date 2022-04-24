import java.util.Scanner;

public class Manumanager {
	
	public static void main(String[] args) {
		int selectedMenuNum = 0;
		Scanner input = new Scanner(System.in);
		PayManager payManager = new PayManager(input);
		
		while (selectedMenuNum != 5) {
				System.out.println("1. Add Pay");
				System.out.println("2. Delete Pay");
				System.out.println("3. Edit Pay");
				System.out.println("4. View Pays");
				System.out.println("5. Exit");
				System.out.print("Select Menu between 1-5 : ");
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
				}
			}
		
		}

	}


