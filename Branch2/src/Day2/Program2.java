package Day2;

// Calculate the square root of a number 

public class Program2 {
	public static double sqrt(int num, double guess) {
		double new_guess = (guess + num/guess)/2;
		if(new_guess == guess) {
			return new_guess;
		}
		return sqrt(num, new_guess);
	}
	
	public static void main(String[] args) {
		System.out.println(sqrt(3, 3%2));
	}
}
