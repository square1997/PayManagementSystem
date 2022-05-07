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
			System.out.println("업종을 선택해주세요");
			System.out.println("1. 편의점");
			System.out.println("2. 카페 ");
			System.out.println("업종 선택 : ");
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
				System.out.println("1 ~ 2까지의 숫자를 입력해주세요.");
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
			System.out.println("입력된 PAY ID("+ id +") 에 대한 기록이 삭제되었습니다.");
		}
		else {
			System.out.println("입력된 PAY ID("+ id +") 에 대한 기록이 없습니다.");
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
					System.out.println("1. PAY ID 수정"); 
					System.out.println("2. 일한 장소 수정"); 
					System.out.println("3. 일한 날짜 수정"); 
					System.out.println("4. 시급 수정"); 
					System.out.println("5. 일한 시간 수정"); 
					System.out.println("6. 급여 수령 날짜 수정"); 
					System.out.println("7. 주메뉴로 돌아가기"); 
					System.out.print("수정할 내용을 선택해 주세요 : "); 
					num = input.nextInt();
				
					if(num == 1) {
						System.out.print("PAY ID 입력(수정) : "); 
						int edit1 = input.nextInt();
						payInput.setPayId(edit1);
						System.out.println("PAY ID 수정 : " + edit1); 
					}
					else if(num == 2) {
						System.out.print("일한 장소(수정) : "); 
						String edit2 = input.next();
						payInput.setPlace(edit2);
						System.out.println("일한 장소 수정 : " + edit2); 
					}
					else if(num == 3) {
						System.out.print("년 : ");
						int edit3 = input.nextInt();
						System.out.print("월 : ");
						int edit4 = input.nextInt();
						System.out.print("일 : ");
						int edit5 = input.nextInt();
						payInput.setYear(edit3);
						payInput.setMonth(edit4);
						payInput.setDay(edit5);
						System.out.println("일한 날짜 수정 : " + edit3 + "-" + edit4 + "-" + edit5); 
					}
					else if(num == 4) {
						System.out.print("시급 입력(수정) : "); 
						int edit6 = input.nextInt();
						payInput.setT_pay(edit6);
						System.out.println("시급 수정 : " + edit6); 
					}
					else if(num == 5) {
						System.out.print("일한 시간 입력(수정) : "); 
						int edit7 = input.nextInt();
						payInput.setTime(edit7);
						System.out.println("일한 시간 수정 : " + edit7); 
					}
					else if(num == 6) {
						System.out.print("년 : ");
						int edit8 = input.nextInt();
						System.out.print("월 : ");
						int edit9 = input.nextInt();
						System.out.print("일 : ");
						int edit10 = input.nextInt();
						payInput.setYear_r(edit8);
						payInput.setMonth_r(edit9);
						payInput.setDay_r(edit10);
						System.out.println("급여 수령 날짜 수정 : " + edit8 + "-" + edit9 + "-" + edit10);
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
