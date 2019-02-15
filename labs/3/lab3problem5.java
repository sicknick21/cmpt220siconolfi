import java.util.Scanner;
public class lab3problem5 {

	public static double average(double a, double b, double c){

		double sum = a + b + c; 
		double average = sum / 3; 
		return average;
	}
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a : ");
		double a = input.nextDouble();
		System.out.print("Enter b : ");
		double b = input.nextDouble();
		System.out.print("Enter c : ");
		double c = input.nextDouble();
		System.out.println("Average is : "+average(a,b,c)); 
		}
		}
