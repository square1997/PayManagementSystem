import java.util.Scanner;

import pay.CafePay;
import pay.ConveniencePay;
import pay.PayInfo;
import pay.PayInput;
import pay.PlaceKind;

import java.util.ArrayList;
public class PayManager {
	Scanner input;
	ArrayList<PayInput> pays = new  ArrayList<PayInput>();
	
	PayManager(Scanner input) {
		this.input = input;
	}
	
	public void addpay() {
		int kind = 0;
		PayInput payInput;
		while(kind != 1 && kind != 2) {
			System.out.println("������ �������ּ���");
			System.out.println("1. ������");
			System.out.println("2. ī�� ");
			System.out.println("���� ���� : ");
			kind = input.nextInt();
			if (kind == 1) {
				payInput = new ConveniencePay(PlaceKind.Convenience);
				payInput.getUserInput(input);
				pays.add(payInput);
				payInput.placeChoose();
				payInput.printPayInfo();
				break;
			}
			else if (kind == 2) {
				payInput = new CafePay(PlaceKind.Cafe);
				payInput.getUserInput(input);
				pays.add(payInput);
				payInput.placeChoose();
				payInput.printPayInfo();
				break;		
			}
			else {
				System.out.println("1 ~ 2������ ���ڸ� �Է����ּ���.");
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
			PayInput payInput = pays.get(i);
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
						payInput.setPayId(edit1);
						System.out.println("PAY ID ���� : " + edit1); 
					}
					else if(num == 2) {
						System.out.print("���� ���(����) : "); 
						String edit2 = input.next();
						payInput.setPlace(edit2);
						System.out.println("���� ��� ���� : " + edit2); 
					}
					else if(num == 3) {
						System.out.print("�� : ");
						int edit3 = input.nextInt();
						System.out.print("�� : ");
						int edit4 = input.nextInt();
						System.out.print("�� : ");
						int edit5 = input.nextInt();
						payInput.setYear(edit3);
						payInput.setMonth(edit4);
						payInput.setDay(edit5);
						System.out.println("���� ��¥ ���� : " + edit3 + "-" + edit4 + "-" + edit5); 
					}
					else if(num == 4) {
						System.out.print("�ñ� �Է�(����) : "); 
						int edit6 = input.nextInt();
						payInput.setT_pay(edit6);
						System.out.println("�ñ� ���� : " + edit6); 
					}
					else if(num == 5) {
						System.out.print("���� �ð� �Է�(����) : "); 
						int edit7 = input.nextInt();
						payInput.setTime(edit7);
						System.out.println("���� �ð� ���� : " + edit7); 
					}
					else if(num == 6) {
						System.out.print("�� : ");
						int edit8 = input.nextInt();
						System.out.print("�� : ");
						int edit9 = input.nextInt();
						System.out.print("�� : ");
						int edit10 = input.nextInt();
						payInput.setYear_r(edit8);
						payInput.setMonth_r(edit9);
						payInput.setDay_r(edit10);
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
