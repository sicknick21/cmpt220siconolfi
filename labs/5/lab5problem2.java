import java.util.Scanner;
public class lab5problem2 {
	
	public static double mean(double[] x) {
		double sum = 0, mean = 0, len = x.length;
		for (double n : x)
	
			sum += n;
			mean = sum / len;
			return mean;
}
	public static double deviation(double x[]) {
		double sqDiff = 0, len = x.length;
		double mean = mean(x);
		for (int i = 0; i < len; i++)
	
			sqDiff += (x[i] - mean) * (x[i] - mean);
	
			return Math.sqrt(sqDiff / (len - 1)); // JA
}
	public static void main(String[] args) {
		double arr[] = new double[10];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 Numbers:");

	for (int i = 0; i < 10; i++)

		arr[i] = input.nextDouble();
		System.out.println("Mean : " + mean(arr));
		System.out.println("Standard Deviation: " + deviation(arr));
}
}


