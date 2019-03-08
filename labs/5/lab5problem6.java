import java.util.Scanner;
public class lab5problem6 {
	
	public static double averageRow(double[][] array, int columnIndex){

		double sum = 0;
		System.out.println("The Array is:");
		for(int i=0;i<5; i++){

		for(int j=0; j<5; j++){

		System.out.print(array[i][j] + "\t\t");
		}
		System.out.println();
		}
		
		for(int i = 0; i <5; i++){
		sum += array[i][columnIndex];
		}
		return (sum/5);
	}
	public static void main(String[] args) {

		double[][] twoDimensionalArray = {{3, 9, 2, 4, 1},
		{8, 6, 8, 36, 10},
		{19, 38, 11, 14, 19},
		{12, 56, 18, 13, 20},
		{27, 21, 23, 24, 25}, };

		System.out.println("The average of the first column is: " + averageRow(twoDimensionalArray, 0)); 

		}
	}
