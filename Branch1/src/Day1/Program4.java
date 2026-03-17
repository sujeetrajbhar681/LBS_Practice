package Day1;

// Check if Number is a Armstrong 

public class Program4 {
	public static void main(String[] args) {

		int num = 370;
		int sum = 0;
		int n = num;
		while (num != 0) {
			int rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (n == sum) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not Armstrong Number");
		}
	}
}
