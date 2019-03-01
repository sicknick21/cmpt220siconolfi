import java.util.Scanner;
public class lab4problem3 {

	public static void main(String[] args) {
		System.out.print("Enter a string: ");

		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		if(isPalindrome(word))
		{
		System.out.println("This string is a palindrome.");
		}
		else
		{
		System.out.println("This string is not a palindrome.");
		}
		}
		public static String reverse(String word)
		{
		String temp = "";
		for(int i=word.length()-1 ; i>=0 ;i--)
		{
		temp = temp + word.charAt(i);
		}
		return temp;
		}
		public static boolean isPalindrome(String word)
		{
		int flag = 1;
		String word_reversed = reverse(word);
		for(int i=0 ; i<word.length(); i++)
		{
		if(word.charAt(i) != word_reversed.charAt(i))
		{
		flag = 0;
		break;
		}
		}
		if(flag==0)
		{
		return false;
		}
		else
		{
		return true;
		}
		

	}

}
