package pay;

import java.util.Scanner;

public interface PayInput {
	public void getUserInput(Scanner input) ;
	public int getPayId();
	public void placeChoose();
	public void printPayInfo();
	public void setPlace(String place);
	public void setPayId(int payId);
	public void setYear(int year);
	public void setMonth(int month);
	public void setDay(int day);
	public void setT_pay(int t_pay);
	public void setTime(int time);
	public void setYear_r(int year_r);
	public void setMonth_r(int month_r);
	public void setDay_r(int day_r);
}
