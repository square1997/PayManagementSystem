package pay;

import java.util.Scanner;

public class ConveniencePay extends PayInfo{
	
	public ConveniencePay(PlaceKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("입력하는 PAY 기록에 대한 ID를 지정해주세요(정수) : ");
		int payId = input.nextInt();
		this.setPayId(payId);
		
		System.out.print("일한 장소 이름 : "); 
		String place = input.next(); 
		this.setPlace(place);
		
		System.out.print("점포명 : "); 
		String storeAddress = input.next(); 
		this.setStoreAddress(storeAddress);
		
		char answer = 'c';
		while(answer != 'y' || answer != 'n' || answer != 'Y' || answer != 'N') {
			System.out.print("튀김기가 존재하나요?(y/n) : "); 
			answer = input.next().charAt(0); 
			if (answer == 'y' || answer == 'Y') {
				this.setFriedMachine("튀김기 사용 가게");
				break;
			}
			else if (answer == 'n' || answer == 'N') {
				this.setFriedMachine("튀김기 미사용 가게");
				break;
			}
			else {
				System.out.println("y 혹은 n으로 입력해주세요."); 
			}
		}
		
		System.out.println("일한 날짜");
		System.out.print("년 : ");
		int year = input.nextInt();
		this.setYear(year);
		System.out.print("월 : ");
		int month = input.nextInt();
		this.setMonth(month);
		System.out.print("일 : ");
		int day = input.nextInt();
		this.setDay(day);
		
		System.out.print("시급 : ");
		int t_pay = input.nextInt();
		this.setT_pay(t_pay);
		
		System.out.print("일한 시간 : ");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.println("급여 수령 날짜");
		System.out.print("년 : ");
		int year_r = input.nextInt();
		this.setYear_r(year_r);
		System.out.print("월 : ");
		int month_r = input.nextInt();
		this.setMonth_r(month_r);
		System.out.print("일 : ");
		int day_r = input.nextInt();
		this.setDay_r(day_r);
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
			System.out.println("튀김기 존재 여부 : " + friedMachine);
			System.out.println("------------------------------------------------------------------------------------------------------");
	}
}