import java.util.Random;
public class lab4problem2 {

	public static void main(String[] args) {
		char matrix[][] = new char[5][5];
		Random random = new Random();
		for(int i=0;i<5;i++){
		for(int x=0;x<5;x++){
		char letter = (char)(random.nextInt(26)+'a'); 
		matrix[i][x] = letter; 
		System.out.print(matrix[i][x]+" "); 
		}
		System.out.print("\n");
		}

	}

}
