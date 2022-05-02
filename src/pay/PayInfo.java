package pay;

import java.util.Scanner;

public class PayInfo {
	protected PlaceKind  kind = PlaceKind.Convenience;
	protected  String place, storeAddress, friedMachine, skind;
	protected  int payId, year, month, day, t_pay, time, year_r,  month_r, day_r;
		
	public PayInfo() {
	}
    
	public PayInfo(PlaceKind kind) {
		this.kind = kind;
	}
	
	public PlaceKind getKind() {
		return kind;
	}
	public void setKind(PlaceKind kind) {
		this.kind = kind;
	}
	public String getStoreAddress() {
		return storeAddress;
	}
	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}
	public String getFriedMachine() {
		return friedMachine;
	}
	public void setFriedMachine(String friedMachine) {
		this.friedMachine = friedMachine;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getPayId() {
		return payId;
	}
	public void setPayId(int payId) {
		this.payId = payId;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getT_pay() {
		return t_pay;
	}
	public void setT_pay(int t_pay) {
		this.t_pay = t_pay;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getYear_r() {
		return year_r;
	}
	public void setYear_r(int year_r) {
		this.year_r = year_r;
	}
	public int getMonth_r() {
		return month_r;
	}
	public void setMonth_r(int month_r) {
		this.month_r = month_r;
	}
	public int getDay_r() {
		return day_r;
	}
	public void setDay_r(int day_r) {
		this.day_r = day_r;
	}

	public void placeChoose() {
		switch(this.kind) {
		case Convenience:
			skind = "������";
			break;
		case Cafe:
			skind = "ī��";
			break;
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
		System.out.println("------------------------------------------------------------------------------------------------------");
	}
	public void getUserInput(Scanner input) {
		System.out.print("�Է��ϴ� PAY ��Ͽ� ���� ID�� �������ּ���(����) : ");
		int payId = input.nextInt();
		this.setPayId(payId);
		
		System.out.print("���� ��� �̸� : "); 
		String place = input.next(); 
		this.setPlace(place);
		
		System.out.print("������ : "); 
		String storeAddress = input.next(); 
		this.setStoreAddress(storeAddress);
		
		System.out.println("���� ��¥");
		System.out.print("�� : ");
		int year = input.nextInt();
		this.setYear(year);
		System.out.print("�� : ");
		int month = input.nextInt();
		this.setMonth(month);
		System.out.print("�� : ");
		int day = input.nextInt();
		this.setDay(day);
		
		System.out.print("�ñ� : ");
		int t_pay = input.nextInt();
		this.setT_pay(t_pay);
		
		System.out.print("���� �ð� : ");
		int time = input.nextInt();
		this.setTime(time);
		
		System.out.println("�޿� ���� ��¥");
		System.out.print("�� : ");
		int year_r = input.nextInt();
		this.setYear_r(year_r);
		System.out.print("�� : ");
		int month_r = input.nextInt();
		this.setMonth_r(month_r);
		System.out.print("�� : ");
		int day_r = input.nextInt();
		this.setDay_r(day_r);
	}
}
