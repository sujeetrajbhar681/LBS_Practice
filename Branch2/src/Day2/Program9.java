package Day2;

//Write a Program to convert Days to year,weeks and days

public class Program9 {
	public static void main(String[] args) {
		int num=1000;
		
		int year = num/365;
		int week = (num%365)/7;
		int r_day=(num%365)%7;
		
		System.out.println(year+ " "+ week + " "+ r_day);
	}
}
