import java.util.Scanner;
public class lab5problem7 {

	  public static boolean isUpperTriangular(double[][] array) {
	        for(int i=0; i<array.length; i++) {
	            for(int j=0; j<array[i].length; j++) {
	                if(i > j && array[i][j] != 0) {
	                    return false;
	                }
	            }
	        }
	        return true;
	    }

	    public static boolean equal(int x[], int y[]) {
	        if(x == null || y == null || x.length != y.length) {
	            return false;
	        }
	        for(int i=0; i<x.length; i++) {
	            if(x[i] != y[i]) {
	                return false;
	            }
	        }
	        return true;
	    }


	    public static void main(String args[]) {
	        double matrix[][] = {{2, 1, 4}, {0, 3, -1}, {0, 0, -2}};
	        System.out.println(isUpperTriangular(matrix));
	        
	    }
}