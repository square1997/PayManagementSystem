import java.util.ArrayList;

public class PayInfo {
	String place;
	int payId, year, month, day, t_pay, time, year_r, month_r, day_r;
	ArrayList information = new ArrayList();
	public PayInfo() {
	}
	public PayInfo(String place, int payId, int year, int month, int day,  int t_pay,  int time,  int year_r,  int month_r,  int day_r) {
	
	}
	
	public void assignmentValue() {
		this.place = String.valueOf(information.get(1));
		this.payId = (int)information.get(0);
		this.year = (int)information.get(2);
		this.month = (int)information.get(3);
		this.day = (int)information.get(4);
		this.t_pay =  (int)information.get(5);
		this.time = (int)information.get(6);
		this.year_r = (int)information.get(7);
		this.month_r = (int)information.get(8);
		this.day_r = (int)information.get(9);
	}
	
	public void printPayInfo() {
		System.out.println("------------------------------------------------------------------------------------------------------");
		System.out.println("PAY ID : " + payId);
		System.out.println("일한 장소 : " + place);
		System.out.println("일한 날짜 : " + year + "-" + month + "-" + day + "\n" + "시급 : " + t_pay);
		System.out.println("급여 수령 날짜 : " + year_r + "-" + month_r + "-" + day_r);
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	
}
