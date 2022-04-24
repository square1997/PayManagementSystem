package pay;

import java.util.Scanner;

public class CafePay extends PayInfo {
	public void getUserInput(Scanner input) {
		System.out.print("입력하는 PAY 기록에 대한 ID를 지정해주세요(정수) : ");
		int payId = input.nextInt();
		this.setPayId(payId);
		
		System.out.print("일한 장소 이름 : "); 
		String place = input.next(); 
		this.setPlace(place);
		
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
				String storeAddress = input.next(); 
				this.setStoreAddress(storeAddress);
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
}
