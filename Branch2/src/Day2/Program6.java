package Day2;

// Find Number of time X Digit occurs in a given input

public class Program6 {
	public static void main(String[] args) {
		int num=23242, x=2;
		int count=0;
		
		while(num!=0) {
			int rem = num%10;
			if(rem==x) {
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
