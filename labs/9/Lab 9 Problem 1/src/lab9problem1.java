import java.util.Random;
import java.util.Scanner;
public class lab9problem1 {

	public static void main(String[] args) {
		final int size = 100;
		Random ran = new Random();
		Scanner input = new Scanner(System.in);
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
			arr[i] = 1 + ran.nextInt(100);
		}
		
		System.out.println("Enter the index of the array: ");
		int index = input.nextInt();
		
		try
		{
			int value = arr[index];
			System.out.println("Corresponding value at index " + index + " is " + value);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds");
		}

	}

}
