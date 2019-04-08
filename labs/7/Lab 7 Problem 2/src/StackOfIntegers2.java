import java.util.Scanner;

public class StackOfIntegers2 {
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
	System.out.println("Enter an integer value");
	int num = input.nextInt();
	StackOfIntegers stack = new StackOfIntegers();
	for (int i=2; i<=num; i++)
		while (num%i == 0) {
			stack.push(i);
			num = num/i;
		}
	int size = stack.getSize();
	for (int i=0; i< size; i++)
		System.out.println(stack.pop() + " ");
	}
}


