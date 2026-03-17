package Day2;

// Write a Program to find the sum of even number between a given range

public class Programe10 {

    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int start = 11, range = 20, sum = 0;

        for (int i = start; i <= range; i++) {
            if (isEven(i)) {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}