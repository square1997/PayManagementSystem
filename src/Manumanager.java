import java.util.Scanner;

public class Manumanager {
	
	public static void addpay() {
		Scanner input = new Scanner(System.in);
		System.out.print("일한 장소 : "); 
		String place = input.nextLine();    
		System.out.println("일한 날짜");
		System.out.print("년 : ");
		int year = input.nextInt();
		System.out.print("월 : ");
		int month = input.nextInt();
		System.out.print("일 : ");
		int day = input.nextInt();
		System.out.print("시급 : ");
		int t_pay = input.nextInt();
		System.out.print("일한 시간 : ");
		int time = input.nextInt();
		System.out.println("급여 수령 날짜");
		System.out.print("년 : ");
		int year_r = input.nextInt();
		System.out.print("월 : ");
		int month_r = input.nextInt();
		System.out.print("일 : ");
		int day_r = input.nextInt();
	}
	
	public static void deletepay() {
		Scanner input = new Scanner(System.in); // 임시 기능 구현
		System.out.print("일한 장소 : "); 
		String place = input.next();
		
	} 
	
	public static void viewpay() {
		Scanner input = new Scanner(System.in); // 임시 기능 구현
		System.out.print("일한 장소 : ");
		String place = input.next();
		
	}
	
	public static void editpay() {
		Scanner input = new Scanner(System.in); // 임시 기능 구현
		System.out.print("일한 장소 : "); 
		String place = input.next();
		
	}
	
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
					addpay();
					break;
				case 2 :
					deletepay();
					break;
				case 3 :
					editpay();
					break;
				case 4 :
					viewpay();
					break;
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


