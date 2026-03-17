package Day2;

// Calculate Lowest Common Multiple (LCM)

public class Program1 {
	public static void main(String[] args) {

		int n1 = 6, n2 = 12, lcm = 0;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				lcm= i;
			}
		}
		System.out.println(lcm);
	}
}
