package pay;

import java.util.Scanner;

public class CafePay extends PayInfo{
	
	public CafePay(PlaceKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("입력하는 PAY 기록에 대한 ID를 지정해주세요(정수) : ");
		inputPayId(input);
		
		System.out.print("일한 장소 이름 : "); 
		inputPayPlace(input);
		
		cafeType(input);
		
		System.out.println("일한 날짜");
		inputWorkDay(input);
		
		System.out.print("시급 : ");
		inputHourlyWage(input);
		
		System.out.print("일한 시간 : ");
		inputTime(input);
		
		System.out.println("급여 수령 날짜");
		 inputDateOfPayment(input);
	}
	
	public void cafeType(Scanner input) {
		char answer = 'c';
		while(answer != 'y' || answer != 'n' || answer != 'Y' || answer != 'N') {
			System.out.print("개인 카페인가요?(y/n) : "); 
			answer = input.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				this.setStoreAddress("");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				System.out.print("점포명 : "); 
				inputAddress(input);
				break;
			}
			else {
				System.out.println("y 혹은 n으로 입력해주세요."); 
			}
		}
	}
	public void printPayInfo() {
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("PAY ID : " + payId);
		System.out.println("직종 : " + skind);
		System.out.println("일한 장소 : " + place);
		System.out.println("점포명 : " + storeAddress);
		System.out.println("일한 날짜 : " + year + "-" + month + "-" + day + "\n" + "시급 : " + t_pay);
		System.out.println("일한 시간 : " + time);
		System.out.println("급여 수령 날짜 : " + year_r + "-" + month_r + "-" + day_r);
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
}
