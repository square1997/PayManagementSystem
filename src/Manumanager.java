import java.util.Scanner;

public class Manumanager {

	public static void main(String[] args) {
		int selectedMenuNum = 0;
		Scanner input = new Scanner(System.in);
		
		while (selectedMenuNum != 6) {
				System.out.println("1. Add Pay");
				System.out.println("2. Delete Pay");
				System.out.println("3. Edit Pay");
				System.out.println("4. View Pay");
				System.out.println("5. Show a menu");
				System.out.println("6. Exit");
				System.out.print("Select Menu between 1-6 : ");
				selectedMenuNum = input.nextInt();
				switch(selectedMenuNum) {
				case 1 :
				case 2 :
				case 3 :
				case 4 :
				case 5 :
					System.out.println();
					continue;
				case 6 :
					System.out.println("End the program.");
					break;
				}
			}
		
		}

	}


