import java.io.*;
public class lab9problem3 {

	public static void main(String[] args) throws IOException {
		try {
			BufferedReader bf= new  BufferedReader
					(new InputStreamReader(System.in));
			System.out.println("Enter a Binary value: ");
			String str = bf.readLine();
			int i = binaryToDecimal(str);
			System.out.println("Decimal := " + i);
		}
		catch(NumberFormatException ex) {
			System.out.println("Number Format Exception occured.prgram will exit");
			System.out.println(ex.getMessage());
			System.exit(0);
		}

	}
	public static int binaryToDecimal (String binaryString) {
		int decimalValue = 0;
		for(int i = 0; i < binaryString.length(); i++) {
			Character binaryChar = binaryString.charAt(i);
			String tempStr = binaryChar.toString();
			int tempInt = Integer.parseInt(tempStr);
			if(tempInt != 0 && tempInt != 1 )
			{
				// JA: You had to throw an exception
				System.out.println("Invalid binary number entered. Program will end.");
				System.exit(0);
				
			}
			decimalValue = decimalValue * 2 + tempInt;
		}
		return decimalValue;
	}
}
