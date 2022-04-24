package pay;

import java.util.Scanner;

public class CafePay extends PayInfo {
	public void getUserInput(Scanner input) {
		System.out.print("�Է��ϴ� PAY ��Ͽ� ���� ID�� �������ּ���(����) : ");
		int payId = input.nextInt();
		this.setPayId(payId);
		
		System.out.print("���� ��� �̸� : "); 
		String place = input.next(); 
		this.setPlace(place);
		
		char answer = 'c';
		while(answer != 'y' || answer != 'n' || answer != 'Y' || answer != 'N') {
			System.out.print("���� ī���ΰ���?(y/n) : "); 
			answer = input.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				this.setStoreAddress("");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print("������ : "); 
				String storeAddress = input.next(); 
				this.setStoreAddress(storeAddress);
				break;
			}
			else {
				System.out.println("y Ȥ�� n���� �Է����ּ���."); 
			}
		}
		
		System.out.println("���� ��¥");
		System.out.print("�� : ");
		int year = input.nextInt();
		this.setYear(year);
		System.out.print("�� : ");
		int month = input.nextInt();
		this.setMonth(month);
		System.out.print("�� : ");
		int day = input.nextInt();
		this.setDay(day);
		
		System.out.print("�ñ� : ");
		int t_pay = input.nextInt();
		this.setT_pay(t_pay);
		
		System.out.print("���� �ð� : ");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.println("�޿� ���� ��¥");
		System.out.print("�� : ");
		int year_r = input.nextInt();
		this.setYear_r(year_r);
		System.out.print("�� : ");
		int month_r = input.nextInt();
		this.setMonth_r(month_r);
		System.out.print("�� : ");
		int day_r = input.nextInt();
		this.setDay_r(day_r);
	}
}
