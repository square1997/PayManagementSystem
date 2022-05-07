package pay;

import java.util.Scanner;

public  abstract class PayInfo {
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
			skind = "편의점";
			break;
		case Cafe:
			skind = "카페";
			break;
		}
	}
	
	public abstract void printPayInfo();
}
