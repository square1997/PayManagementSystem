import java.util.Scanner;

public class PayManager {
	PayInfo payInfo;
	Scanner input;
	
	PayManager(Scanner input) {
		this.input = input;
	}
	
	public void addpay() {
		payInfo = new PayInfo();
		System.out.print("�Է��ϴ� PAY ��Ͽ� ���� ID�� �������ּ���(����) : ");
		int payId = input.nextInt();
		payInfo.information.add(payId);
		System.out.print("���� ��� : "); 
		String place = input.next(); 
		payInfo.information.add(place);
		System.out.println("���� ��¥");
		System.out.print("�� : ");
		int year = input.nextInt();
		payInfo.information.add(year);
		System.out.print("�� : ");
		int month = input.nextInt();
		payInfo.information.add(month);
		System.out.print("�� : ");
		int day = input.nextInt();
		payInfo.information.add(day);
		System.out.print("�ñ� : ");
		int t_pay = input.nextInt();
		payInfo.information.add(t_pay);
		System.out.print("���� �ð� : ");
		int time = input.nextInt();
		payInfo.information.add(time);
		System.out.println("�޿� ���� ��¥");
		System.out.print("�� : ");
		int year_r = input.nextInt();
		payInfo.information.add(year_r);
		System.out.print("�� : ");
		int month_r = input.nextInt();
		payInfo.information.add(month_r);
		System.out.print("�� : ");
		int day_r = input.nextInt();
		payInfo.information.add(day_r);
		
		payInfo.assignmentValue();
		payInfo.printPayInfo();
	}
	
	public  void deletepay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		
		if (payInfo == null) {
			System.out.println("�Էµ� PAY ID�� ���� ����� �����ϴ�.");
			return;
		}
		if (payInfo.payId == id) {
			payInfo = null;
			System.out.println("�Էµ� PAY ID�� ���� ����� �����Ǿ����ϴ�.");
		}
		
	} 
	
	public  void viewpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		
		if (payInfo == null) {
			System.out.println("�Էµ� PAY ID�� ���� ����� �����ϴ�..");
			return;
		}
		
		if (payInfo.payId == id) {
			payInfo.printPayInfo();
		}
	}
	
	public void editpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		System.out.println("1. PAY ID ����"); 
		System.out.println("2. ���� ��� ����"); 
		System.out.println("3. ���� ��¥ ����"); 
		System.out.println("4. �ñ� ����"); 
		System.out.println("5. ���� �ð� ����"); 
		System.out.println("6. �޿� ���� ��¥ ����"); 
		System.out.print("������ ������ ������ �ּ��� : "); 
		int num = input.nextInt();
		
		if (payInfo.payId == id) {
			if(num == 1) {
				System.out.print("PAY ID �Է�(����) : "); 
				int edit1 = input.nextInt();
				payInfo.information.set(0, edit1);
				System.out.println("PAY ID ���� : " + edit1); 
			}
			else if(num == 2) {
				System.out.print("���� ���(����) : "); 
				String edit2 = input.next();
				payInfo.information.set(1, edit2);
				System.out.println("���� ��� ���� : " + edit2); 
			}
			else if(num == 3) {
				System.out.print("�� : ");
				int edit3 = input.nextInt();
				System.out.print("�� : ");
				int edit4 = input.nextInt();
				System.out.print("�� : ");
				int edit5 = input.nextInt();
				payInfo.information.set(2, edit3);
				payInfo.information.set(3, edit4);
				payInfo.information.set(4, edit5);
				System.out.println("���� ��¥ ���� : " + edit3 + "-" + edit4 + "-" + edit5); 
			}
			else if(num == 4) {
				System.out.print("�ñ� �Է�(����) : "); 
				int edit6 = input.nextInt();
				payInfo.information.set(5, edit6);
				System.out.println("�ñ� ���� : " + edit6); 
			}
			else if(num == 5) {
				System.out.print("���� �ð� �Է�(����) : "); 
				int edit7 = input.nextInt();
				payInfo.information.set(6, edit7);
				System.out.println("���� �ð� ���� : " + edit7); 
			}
			else if(num == 6) {
				System.out.print("�� : ");
				int edit8 = input.nextInt();
				System.out.print("�� : ");
				int edit9 = input.nextInt();
				System.out.print("�� : ");
				int edit10 = input.nextInt();
				payInfo.information.set(7, edit8);
				payInfo.information.set(8, edit9);
				payInfo.information.set(9, edit10);
				System.out.println("�޿� ���� ��¥ ���� : " + edit8 + "-" + edit9 + "-" + edit10);
			}
			payInfo.assignmentValue();
		}
		
	}
}
