package pay;

import java.util.Scanner;

public class ConveniencePay extends PayInfo{
	
	public ConveniencePay(PlaceKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("�Է��ϴ� PAY ��Ͽ� ���� ID�� �������ּ���(����) : ");
		inputPayId(input);
		
		System.out.print("���� ��� �̸� : "); 
		 inputPayPlace(input);
		
		System.out.print("������ : "); 
		inputAddress(input);
		
		friedMachine(input);
		
		System.out.println("���� ��¥");
		inputWorkDay(input);
		
		System.out.print("�ñ� : ");
		inputHourlyWage(input);
		
		System.out.print("���� �ð� : ");
		inputTime(input);
		
		System.out.println("�޿� ���� ��¥");
		inputDateOfPayment(input); 
	}
	public void friedMachine(Scanner input) {
		char answer = 'c';
		while(answer != 'y' || answer != 'n' || answer != 'Y' || answer != 'N') {
			System.out.print("Ƣ��Ⱑ �����ϳ���?(y/n) : "); 
			answer = input.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				this.setFriedMachine("Ƣ��� ��� ����");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setFriedMachine("Ƣ��� �̻�� ����");
				break;
			}
			else {
				System.out.println("y Ȥ�� n���� �Է����ּ���."); 
			}
		}
	}
	public void printPayInfo() {
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("PAY ID : " + payId);
		System.out.println("���� : " + skind);
		System.out.println("���� ��� : " + place);
		System.out.println("������ : " + storeAddress);
		System.out.println("���� ��¥ : " + year + "-" + month + "-" + day + "\n" + "�ñ� : " + t_pay);
		System.out.println("���� �ð� : " + time);
		System.out.println("�޿� ���� ��¥ : " + year_r + "-" + month_r + "-" + day_r);
		System.out.println("Ƣ��� ���� ���� : " + friedMachine);
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
}