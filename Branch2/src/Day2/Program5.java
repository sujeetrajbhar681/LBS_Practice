package Day2;

// Replace all 0's with 1 in a given integer 

public class Program5 {
	public static void main(String[] args) {
		int num = 20503,reverse=0;
		
		while(num!=0) {
			int rem = num%10;
			if(rem == 0) {
				rem = 1;
			}
			reverse  =reverse*10+rem;
			num = num/10;
		}
		while(reverse!=0) {
			int rem = reverse%10;
			num = num*10+rem;
			reverse = reverse/10;
		}
		System.out.println(num);
	}
}
