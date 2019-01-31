import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("The formula for special relativity is E = mc^2");
		System.out.println("Enter the number of kilograms:");
		double mass = input.nextDouble();
		double sol = 299972478 * 299972478;
		double e = mass * sol;
		System.out.println("E = " +mass+" kg " +"* 299972478^2 m/s" );
		System.out.println("E = " +e);
		
		

	}

}
