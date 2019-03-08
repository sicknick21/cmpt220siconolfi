import java.util.Scanner;
public class lab5problem1 {

		public static double max(double[] array) {
			double maximum = array[0];
			for (int x = 0; x < array.length; x++)
			if (array[x] > maximum)
			maximum = array[x];
			return maximum;
		}
		public static void main(String[] args) {

				Scanner input = new Scanner(System.in);

				System.out.println("Enter 10 numbers: ");

				double array[] = new double[10];

				for (int x = 0; x < 10; x++) {

				array[x] = Integer.parseInt(input.nextLine());

				}
				System.out.println("Maximum element in the array is: " + max(array));

	

}
}
