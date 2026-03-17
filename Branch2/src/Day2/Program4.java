package Day2;

// Find the Sum of Digit of a Number Using Recursion

public class Program4 {
	public static int SumOfDigit(int num) {
		if (num == 0) {
			return 0;
		}
		int rem = num % 10;
		return rem + SumOfDigit(num / 10);
	}

	public static void main(String[] args) {
		System.out.println(SumOfDigit(123));
	}
}
