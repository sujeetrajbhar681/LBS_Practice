package Day2;

// Write a Program to calculate the Power of a Number

public class Program8 {
	public static void main(String[] args) {
		
		int num=2, power=4,result=1;
		
		for(int i = 1; i<=power; i++) {
			result = result*num;
		}
		System.out.println(result);
	}
}
