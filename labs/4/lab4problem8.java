import java.util.Scanner;
public class lab4problem8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 0, userinput;
		int seq[] = new int[100]; 

		System.out.println("Enter positive numbers and enter 0 to end the sequence: ");
		userinput = input.nextInt();
		
		while(userinput != 0 && n<100)
		{
		seq[n] = userinput; 
		n++; 
		userinput = input.nextInt();
		}
		for (int i=1; i<n; ++i)
		{
		int cur = seq[i]; 
		int j = i-1;

		while (j>=0 && seq[j] > cur)
		{
		seq[j+1] = seq[j];
		j = j-1;
		}
		seq[j+1] = cur; 
		}
		System.out.print("Sorted values: ");
		for(int i=0; i<n; i++)
			
		System.out.print(seq[i] + " ");
		System.out.println();
		input.close();

	}

}
