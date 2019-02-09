import java.util.Scanner;
public class lab2problem1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1;
		int n2;
		System.out.println("Enter the first number");
		n1 = input.nextInt();
		System.out.println("Enter the second number");
		n2 = input.nextInt();
		System.out.println(n1+" is less than "+n2 +" "+(n1<n2));
		System.out.println(n1+" is less than or equal to "+n2 +" "+(n1<=n2));
		System.out.println(n1+" is equal to "+n2 +" "+(n1==n2));
		System.out.println(n1+" is not equal to "+n2 +" "+(n1!=n2));
		System.out.println(n1+" is greater than "+n2 +" "+(n1>n2));
		System.out.println(n1+" is greater than or equal to "+n2 +" "+(n1>=n2));

	}

}
