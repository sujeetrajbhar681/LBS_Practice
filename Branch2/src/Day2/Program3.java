package Day2;

// Convert Decimal Number to Binary

public class Program3 {
	public static void main(String[] args) {
		
		int num = 10;
		String binary = " ";
		
		while(num!=0) {
			int rem = num%2;
			binary = rem+binary;
			num = num/2;
		}
		System.out.println(binary);
	}
}
