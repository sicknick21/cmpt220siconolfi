import java.util.Scanner;
public class lab2problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int first, second;
		System.out.print("Enter first character: ");
		first = input.next().charAt(0); //use next() to the string input and then use charAt() to get the first character in the string
		System.out.print("Enter second character: ");
		second = input.next().charAt(0);
		int res = first + second;
		System.out.println("Result is: " + res );
		}
		
	}


