import java.util.Scanner;

import pay.CafePay;
import pay.ConveniencePay;
import pay.PayInput;
import pay.PlaceKind;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class PayManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8985844917158622207L;
	
	transient Scanner input;
	ArrayList<PayInput> pays = new  ArrayList<PayInput>();
	
	PayManager(Scanner input) {
		this.input = input;
	}
	
	public void addpay() {
		int kind = 0;
		while(kind != 1 && kind != 2) {
			try {
				categoryOfBuisness();
				kind = input.nextInt();
				if (kind == 1) {
					chooseConvenience(kind);
					break;
				}
				else if (kind == 2) {
					chooseCafe(kind);
					break;		
				}
				else {
					System.out.println("1 ~ 2������ ���ڸ� �Է����ּ���.");
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1 ~ 2������ ���ڸ� �Է����ּ���.");
				if (input.hasNext()) {
					input.next();
				}
				kind = -1;
			}
		}
	}
	
	public void categoryOfBuisness() {
		System.out.println("������ �������ּ���");
		System.out.println("1. ������");
		System.out.println("2. ī�� ");
		System.out.println("���� ���� : ");
	}
	
	public void chooseConvenience(int kind) {
		PayInput payInput;
		payInput = new ConveniencePay(PlaceKind.Convenience);
		payInput.getUserInput(input);
		pays.add(payInput);
		payInput.placeChoose();
		payInput.printPayInfo();
	}
	
	public void chooseCafe(int kind) {
		PayInput payInput;
		payInput = new CafePay(PlaceKind.Cafe);
		payInput.getUserInput(input);
		pays.add(payInput);
		payInput.placeChoose();
		payInput.printPayInfo();
	}
	
	public  void deletepay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		int index = findIndex(id);
		removeFromPayInfo(index, id);
	} 
	
	public int findIndex(int id) {
		int index = -1;
		for (int i = 0; i<pays.size(); i++) {
			if (pays.get(i).getPayId() == id) {
				index = i;
	            break;
			}	
		}
		return index;
	}
	
	public int removeFromPayInfo(int index, int id) {
		if (index >= 0) {
			pays.remove(index);
			System.out.println("�Էµ� PAY ID("+ id +") �� ���� ����� �����Ǿ����ϴ�.");
			return 1;
		}
		else {
			System.out.println("�Էµ� PAY ID("+ id +") �� ���� ����� �����ϴ�.");
		    return -1;
		}
	}
	
	public  void viewpays() {
		for (int i = 0; i<pays.size(); i++) {
			pays.get(i).printPayInfo();
		}
	}
	
	public void editpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		findIdAndEditPayInfo(id);
	}
	
	public void showEditMenu() {
		System.out.println("1. PAY ID ����"); 
		System.out.println("2. ���� ��� ����"); 
		System.out.println("3. ���� ��¥ ����"); 
		System.out.println("4. �ñ� ����"); 
		System.out.println("5. ���� �ð� ����"); 
		System.out.println("6. �޿� ���� ��¥ ����"); 
		System.out.println("7. �ָ޴��� ���ư���"); 
		System.out.print("������ ������ ������ �ּ��� : "); 
	}
	
	public void editPayId(Scanner input, PayInput payInput) {
		int edit1 = input.nextInt();
		payInput.setPayId(edit1);
		System.out.println("PAY ID ���� : " + edit1); 
	}
	
	public void editPlace(Scanner input, PayInput payInput) {
			String edit2 = input.next();
			payInput.setPlace(edit2);
			System.out.println("���� ��� ���� : " + edit2); 
	}
	
	public void editWorkDay(Scanner input, PayInput payInput) {
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
	
	public void editHourlyWage(Scanner input, PayInput payInput) {
		int edit6 = input.nextInt();
		payInput.setT_pay(edit6);
		System.out.println("�ñ� ���� : " + edit6); 
	}
	
	public void editTime(Scanner input, PayInput payInput) {
		int edit7 = input.nextInt();
		payInput.setTime(edit7);
		System.out.println("���� �ð� ���� : " + edit7); 
	}
	
	public void editDateOfPayment(Scanner input, PayInput payInput) {
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
	
	public void findIdAndEditPayInfo(int id) {
		for (int i = 0; i<pays.size(); i++) {
			PayInput payInput = pays.get(i);
			if (pays.get(i).getPayId() == id) {
				int num = 0;
				while(num != 7) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						System.out.print("PAY ID �Է�(����) : "); 
						editPayId(input, payInput);
						break;
					case 2:
						System.out.print("���� ���(����) : "); 
						editPlace(input, payInput);
						break;
					case 3:
						editWorkDay(input, payInput);
						break;
					case 4:
						System.out.print("�ñ� �Է�(����) : "); 
						editHourlyWage(input, payInput);
						break;
					case 5:
						System.out.print("���� �ð� �Է�(����) : "); 
						editTime(input, payInput);
						break;
					case 6:
						 editDateOfPayment(input, payInput);
						break;
					default:
						continue;
					}
				}
				break;
			}
		}
	}
}
