import java.util.Scanner;
public class lab4problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String sentence;
		System.out.print("Enter a sentence:");

		sentence=input.nextLine();
		int []count = new int[130];
		for(int i=0;i<sentence.length();i++)
		{
		count[sentence.charAt(i)]++;
		}
		System.out.println("The character counts are:");
		for(int i=65;i<92;i++)
		{
		if(count[i]!=0)
		System.out.println("The number of occurences of "+(char)i+" are ="+count[i]);
		}
		for(int i=97;i<124;i++)
		{
		if(count[i]!=0)
		System.out.println("The number of occurences of "+(char)i+" are: "+count[i]);
		}

	}

}
