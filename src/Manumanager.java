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
					System.out.print("���� ��� : "); 
					place = input.nextLine();    
					System.out.println("���� ��¥");
					System.out.print("�� : ");
					year = input.nextInt();
					System.out.print("�� : ");
					month = input.nextInt();
					System.out.print("�� : ");
					day = input.nextInt();
					System.out.print("�ñ� : ");
					t_pay = input.nextInt();
					System.out.print("���� �ð� : ");
					time = input.nextInt();
					System.out.println("�޿� ���� ��¥");
					System.out.print("�� : ");
					year_r = input.nextInt();
					System.out.print("�� : ");
					month_r = input.nextInt();
					System.out.print("�� : ");
					day_r = input.nextInt();
				case 2 :
					System.out.println("��� �߰� �����Դϴ�.");
				case 3 :
					System.out.println("��� �߰� �����Դϴ�.");
				case 4 :
					System.out.println("��� �߰� �����Դϴ�.");
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


