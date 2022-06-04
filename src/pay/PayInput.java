package pay;

import java.util.Scanner;

public interface PayInput {
	public void getUserInput(Scanner input) ;
	public void placeChoose();
	public void printPayInfo();
	public void setPlace(String place);
	public String getPlace();
	public String getStoreAddress();
	public void setPayId(int payId);
	public int getPayId();
	public void setYear(int year);
	public int getYear();
	public void setMonth(int month);
	public int getMonth();
	public void setDay(int day);
	public int getDay();
	public void setT_pay(int t_pay);
	public int getT_pay();
	public void setTime(int time);
	public int getTime();
	public void setYear_r(int year_r);
	public int getYear_r();
	public void setMonth_r(int month_r);
	public int getMonth_r();
	public void setDay_r(int day_r);
	public int getDay_r();
	public String getWorkDay();
	public String getDateOfPayment();
}
