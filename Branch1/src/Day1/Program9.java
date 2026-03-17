package Day1;

// Check Year is Leap Year or not 

public class Program9 {
	public static void main(String[] args) {
		
		int year = 2028;

		if (year % 4 == 0) {
		    if (year % 100 == 0) {
		        if (year % 400 == 0) {
		            System.out.println("Leap");
		        } else {
		            System.out.println("Not");
		        }
		    } else {
		        System.out.println("Leap");
		    }
		} else {
		    System.out.println("Not");
		}
		
//		int year = 2028;
//
//		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//		    System.out.println("Leap");
//		} else {
//		    System.out.println("Not Leap");
//		}
	}
}
