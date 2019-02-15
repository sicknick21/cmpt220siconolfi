import java.util.Scanner; 
public class lab3problem7 {

	public static void main(String[] args) {
	int count = 1;
	for(int x = 1; x <= 50; x++){
	System.out.printf("%-6d",getPentagonalNumber(x));
	if(count % 10 == 0) System.out.println();
	count++;
		}
    }
	public static int getPentagonalNumber(int n) {
	return (3*n*n - n)/2;
	}
}