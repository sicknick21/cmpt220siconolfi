import java.util.Random;
import java.util.Scanner;
public class lab2problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Enter a lower limit integer:");
		num1 = input.nextInt();
		System.out.println("Enter a upper limit integer:");
		num2 = input.nextInt();
		for (int i = 0; i < 3; i++) {
	           System.out.println(getRandom(num1, num2));
	   }
	   }

	   public static int getRandom(int num1, int num2) {

	       if (num1 >= num2) {
	           throw new IllegalArgumentException("max must be greater than min");
	       }

	       Random r = new Random();
	       return r.nextInt((num2 - num1) + 1) + num1;

	}

}
