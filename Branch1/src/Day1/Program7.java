package Day1;

//Find the Sum of Digit of a Number 

public class Program7 {
	public static void main(String[] args) {
		int num= 123;
		int sum=0;
		
		 while(num!=0) {
			 int rem = num%10;
			 sum = sum+rem;
			 num = num/10;
		 }
		 System.out.println(sum);
	}
}
