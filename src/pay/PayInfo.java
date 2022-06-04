package pay;

import java.io.Serializable;
import java.util.Scanner;

public  abstract class PayInfo implements PayInput, Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8609195836073973805L;
	
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
			this.skind = "Convenience";
			break;
		case Cafe:
			this.skind = "Cafe";
			break;
		}
	}
	
	public abstract void printPayInfo();
	
	public void inputPayId(Scanner input) {
		int payId = input.nextInt();
		this.setPayId(payId);
	}
	public void inputPayPlace(Scanner input) {
		String place = input.next(); 
		this.setPlace(place);
	}
	public void inputAddress(Scanner input) {
		String storeAddress = input.next(); 
		this.setStoreAddress(storeAddress);
	}
	public void inputWorkDay(Scanner input) {
		System.out.print("년 : ");
		int year = input.nextInt();
		this.setYear(year);
		System.out.print("월 : ");
		int month = input.nextInt();
		this.setMonth(month);
		System.out.print("일 : ");
		int day = input.nextInt();
		this.setDay(day);
	}
	public void inputHourlyWage(Scanner input) {
		int t_pay = input.nextInt();
		this.setT_pay(t_pay);
	}
	public void inputTime(Scanner input) {
		int time = input.nextInt();
		this.setTime(time);
	}
	public void inputDateOfPayment(Scanner input) {
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
	
	public String getWorkDay() {
		String workdate = this.year+"-"+this.month+"-"+this.day;
		return workdate;
	}
	
	public String getDateOfPayment() {
		String dateOfPayment = this.year_r+"-"+this.month_r+"-"+this.day_r;
		return dateOfPayment;
	}
}
