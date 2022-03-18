import java.util.Scanner;

public class Manumanager {

	public static void main(String[] args) {
		String place;
		int year, month, day, t_pay, time, year_r, month_r, day_r;
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
					System.out.print("일한 장소 : "); 
					place = input.nextLine();    
					System.out.println("일한 날짜");
					System.out.print("년 : ");
					year = input.nextInt();
					System.out.print("월 : ");
					month = input.nextInt();
					System.out.print("일 : ");
					day = input.nextInt();
					System.out.print("시급 : ");
					t_pay = input.nextInt();
					System.out.print("일한 시간 : ");
					time = input.nextInt();
					System.out.println("급여 수령 날짜");
					System.out.print("년 : ");
					year_r = input.nextInt();
					System.out.print("월 : ");
					month_r = input.nextInt();
					System.out.print("일 : ");
					day_r = input.nextInt();
				case 2 :
					System.out.println("기능 추가 예정입니다.");
				case 3 :
					System.out.println("기능 추가 예정입니다.");
				case 4 :
					System.out.println("기능 추가 예정입니다.");
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


