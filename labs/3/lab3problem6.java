import java.util.Scanner;
public class lab3problem6 {

		public static int countVowel(String s){

		int count = 0; 
		for (int i = 0; i < s.length() ; i++ ) {
		char c = s.charAt(i); 
		if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
		c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){ 
		count += 1; 
		}
		}
		return count;
		}
		
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String w = input.next();
		System.out.println("Vowel Count : "+countVowel(w)); 

		}
	}


