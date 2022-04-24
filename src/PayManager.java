import java.util.Scanner;

import pay.CafePay;
import pay.PayInfo;

import java.util.ArrayList;
public class PayManager {
	Scanner input;
	ArrayList<PayInfo> pays = new  ArrayList<PayInfo>();
	
	PayManager(Scanner input) {
		this.input = input;
	}
	
	public void addpay() {
		int kind = 0;
		PayInfo payInfo;
		while(kind != 1 && kind != 2) {
			System.out.println("������ �������ּ���");
			System.out.println("1. ������");
			System.out.println("2. ī�� ");
			System.out.println("���� ���� : ");
			kind = input.nextInt();
			if (kind == 1) {
				payInfo = new PayInfo();
				payInfo.getUserInput(input);
				pays.add(payInfo);
				payInfo.printPayInfo();
				break;
			}
			else if (kind == 2) {
				payInfo = new CafePay();
				payInfo.getUserInput(input);
				pays.add(payInfo);
				payInfo.printPayInfo();
				break;		
			}
			else {
				System.out.println("1 ~ 3������ ���ڸ� �Է����ּ���.");
			}
		}
	}
	
	public  void deletepay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		int index = -1;
		for (int i = 0; i<pays.size(); i++) {
			if (pays.get(i).getPayId() == id) {
				index = i;
	            break;
			}
		}
		if (index >= 0) {
			pays.remove(index);
			System.out.println("�Էµ� PAY ID("+ id +") �� ���� ����� �����Ǿ����ϴ�.");
		}
		else {
			System.out.println("�Էµ� PAY ID("+ id +") �� ���� ����� �����ϴ�.");
		    return;
		}
	} 
	
	public  void viewpays() {
//		System.out.print("PAY ID : "); 
//		int id = input.nextInt();
		for (int i = 0; i<pays.size(); i++) {
			pays.get(i).printPayInfo();
		}
	}
	
	public void editpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		for (int i = 0; i<pays.size(); i++) {
			PayInfo payInfo = pays.get(i);
			if (pays.get(i).getPayId() == id) {
				int num = 0;
				while(num != 7) {
					System.out.println("1. PAY ID ����"); 
					System.out.println("2. ���� ��� ����"); 
					System.out.println("3. ���� ��¥ ����"); 
					System.out.println("4. �ñ� ����"); 
					System.out.println("5. ���� �ð� ����"); 
					System.out.println("6. �޿� ���� ��¥ ����"); 
					System.out.println("7. �ָ޴��� ���ư���"); 
					System.out.print("������ ������ ������ �ּ��� : "); 
					num = input.nextInt();
				
					if(num == 1) {
						System.out.print("PAY ID �Է�(����) : "); 
						int edit1 = input.nextInt();
						payInfo.setPayId(edit1);
						System.out.println("PAY ID ���� : " + edit1); 
					}
					else if(num == 2) {
						System.out.print("���� ���(����) : "); 
						String edit2 = input.next();
						payInfo.setPlace(edit2);
						System.out.println("���� ��� ���� : " + edit2); 
					}
					else if(num == 3) {
						System.out.print("�� : ");
						int edit3 = input.nextInt();
						System.out.print("�� : ");
						int edit4 = input.nextInt();
						System.out.print("�� : ");
						int edit5 = input.nextInt();
						payInfo.setYear(edit3);
						payInfo.setMonth(edit4);
						payInfo.setDay(edit5);
						System.out.println("���� ��¥ ���� : " + edit3 + "-" + edit4 + "-" + edit5); 
					}
					else if(num == 4) {
						System.out.print("�ñ� �Է�(����) : "); 
						int edit6 = input.nextInt();
						payInfo.setT_pay(edit6);
						System.out.println("�ñ� ���� : " + edit6); 
					}
					else if(num == 5) {
						System.out.print("���� �ð� �Է�(����) : "); 
						int edit7 = input.nextInt();
						payInfo.setTime(edit7);
						System.out.println("���� �ð� ���� : " + edit7); 
					}
					else if(num == 6) {
						System.out.print("�� : ");
						int edit8 = input.nextInt();
						System.out.print("�� : ");
						int edit9 = input.nextInt();
						System.out.print("�� : ");
						int edit10 = input.nextInt();
						payInfo.setYear_r(edit8);
						payInfo.setMonth_r(edit9);
						payInfo.setDay_r(edit10);
						System.out.println("�޿� ���� ��¥ ���� : " + edit8 + "-" + edit9 + "-" + edit10);
					}
					else {
						continue;
					}
				}
				break;
			}
		}
	}
}