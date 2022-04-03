import java.util.Scanner;

public class PayManager {
	PayInfo payInfo;
	Scanner input;
	
	PayManager(Scanner input) {
		this.input = input;
	}
	
	public void addpay() {
		payInfo = new PayInfo();
		System.out.print("입력하는 PAY 기록에 대한 ID를 지정해주세요(정수) : ");
		int payId = input.nextInt();
		payInfo.information.add(payId);
		System.out.print("일한 장소 : "); 
		String place = input.next(); 
		payInfo.information.add(place);
		System.out.println("일한 날짜");
		System.out.print("년 : ");
		int year = input.nextInt();
		payInfo.information.add(year);
		System.out.print("월 : ");
		int month = input.nextInt();
		payInfo.information.add(month);
		System.out.print("일 : ");
		int day = input.nextInt();
		payInfo.information.add(day);
		System.out.print("시급 : ");
		int t_pay = input.nextInt();
		payInfo.information.add(t_pay);
		System.out.print("일한 시간 : ");
		int time = input.nextInt();
		payInfo.information.add(time);
		System.out.println("급여 수령 날짜");
		System.out.print("년 : ");
		int year_r = input.nextInt();
		payInfo.information.add(year_r);
		System.out.print("월 : ");
		int month_r = input.nextInt();
		payInfo.information.add(month_r);
		System.out.print("일 : ");
		int day_r = input.nextInt();
		payInfo.information.add(day_r);
		
		payInfo.assignmentValue();
		payInfo.printPayInfo();
	}
	
	public  void deletepay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		
		if (payInfo == null) {
			System.out.println("입력된 PAY ID에 대한 기록이 없습니다.");
			return;
		}
		if (payInfo.payId == id) {
			payInfo = null;
			System.out.println("입력된 PAY ID에 대한 기록이 삭제되었습니다.");
		}
		
	} 
	
	public  void viewpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		
		if (payInfo == null) {
			System.out.println("입력된 PAY ID에 대한 기록이 없습니다..");
			return;
		}
		
		if (payInfo.payId == id) {
			payInfo.printPayInfo();
		}
	}
	
	public void editpay() {
		System.out.print("PAY ID : "); 
		int id = input.nextInt();
		System.out.println("1. PAY ID 수정"); 
		System.out.println("2. 일한 장소 수정"); 
		System.out.println("3. 일한 날짜 수정"); 
		System.out.println("4. 시급 수정"); 
		System.out.println("5. 일한 시간 수정"); 
		System.out.println("6. 급여 수령 날짜 수정"); 
		System.out.print("수정할 내용을 선택해 주세요 : "); 
		int num = input.nextInt();
		
		if (payInfo.payId == id) {
			if(num == 1) {
				System.out.print("PAY ID 입력(수정) : "); 
				int edit1 = input.nextInt();
				payInfo.information.set(0, edit1);
				System.out.println("PAY ID 수정 : " + edit1); 
			}
			else if(num == 2) {
				System.out.print("일한 장소(수정) : "); 
				String edit2 = input.next();
				payInfo.information.set(1, edit2);
				System.out.println("일한 장소 수정 : " + edit2); 
			}
			else if(num == 3) {
				System.out.print("년 : ");
				int edit3 = input.nextInt();
				System.out.print("월 : ");
				int edit4 = input.nextInt();
				System.out.print("일 : ");
				int edit5 = input.nextInt();
				payInfo.information.set(2, edit3);
				payInfo.information.set(3, edit4);
				payInfo.information.set(4, edit5);
				System.out.println("일한 날짜 수정 : " + edit3 + "-" + edit4 + "-" + edit5); 
			}
			else if(num == 4) {
				System.out.print("시급 입력(수정) : "); 
				int edit6 = input.nextInt();
				payInfo.information.set(5, edit6);
				System.out.println("시급 수정 : " + edit6); 
			}
			else if(num == 5) {
				System.out.print("일한 시간 입력(수정) : "); 
				int edit7 = input.nextInt();
				payInfo.information.set(6, edit7);
				System.out.println("일한 시간 수정 : " + edit7); 
			}
			else if(num == 6) {
				System.out.print("년 : ");
				int edit8 = input.nextInt();
				System.out.print("월 : ");
				int edit9 = input.nextInt();
				System.out.print("일 : ");
				int edit10 = input.nextInt();
				payInfo.information.set(7, edit8);
				payInfo.information.set(8, edit9);
				payInfo.information.set(9, edit10);
				System.out.println("급여 수령 날짜 수정 : " + edit8 + "-" + edit9 + "-" + edit10);
			}
			payInfo.assignmentValue();
		}
		
	}
}
