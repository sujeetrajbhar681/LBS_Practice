package Day1;

// Find the GCD (Greatest Common Divisor) of two number

public class Program6 {
	public static void main(String[] args) {
		int n1 = 6, n2 = 12, gcd = 0;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		System.out.println(gcd);
	}
}
