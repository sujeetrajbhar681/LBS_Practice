package Day1;

// Find the Fobonacci Series 

public class Program5 {
	public static void main(String[] args) {
		int n1=0,n2=1,range=5;
		
		for(int i=0; i<range; i++) {
			System.out.print(n1 +" ");
			int n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		System.out.println(n2);
	}
}
