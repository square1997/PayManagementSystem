import java.util.Scanner;

public class Manumanager {
	
	public static void addpay() {
		Scanner input = new Scanner(System.in);
		System.out.print("���� ��� : "); 
		String place = input.nextLine();    
		System.out.println("���� ��¥");
		System.out.print("�� : ");
		int year = input.nextInt();
		System.out.print("�� : ");
		int month = input.nextInt();
		System.out.print("�� : ");
		int day = input.nextInt();
		System.out.print("�ñ� : ");
		int t_pay = input.nextInt();
		System.out.print("���� �ð� : ");
		int time = input.nextInt();
		System.out.println("�޿� ���� ��¥");
		System.out.print("�� : ");
		int year_r = input.nextInt();
		System.out.print("�� : ");
		int month_r = input.nextInt();
		System.out.print("�� : ");
		int day_r = input.nextInt();
	}
	
	public static void deletepay() {
		Scanner input = new Scanner(System.in); // �ӽ� ��� ����
		System.out.print("���� ��� : "); 
		String place = input.next();
		
	} 
	
	public static void viewpay() {
		Scanner input = new Scanner(System.in); // �ӽ� ��� ����
		System.out.print("���� ��� : ");
		String place = input.next();
		
	}
	
	public static void editpay() {
		Scanner input = new Scanner(System.in); // �ӽ� ��� ����
		System.out.print("���� ��� : "); 
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


