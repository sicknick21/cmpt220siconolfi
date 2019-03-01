import java.util.Scanner;
public class lab4problem7 {

	public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        int size = 0;
        int i=0;
        int x=0;
        System.out.print("Enter the size of the array: ");
        size=scan.nextInt();
        int[] array=new int[size+1];
        array[size]=-1;
        System.out.print("Enter the numbers : ");
        while(i<size)
        {
        array[i]=scan.nextInt();
        i++;
        }
        System.out.print("The array with dupicates :\n");
        i=0;
        while(array[i]!=-1)
        {
        System.out.print(""+array[i]+", ");
            i++;
        }
        i=0;
        x=0;
        while(array[i]!=-1)
        {
        x=0;
        while(array[x]!=-1)
            
        {
        if(array[i]==array[x] && i!=x)
        {
        	
        int o=x;
        
        while(array[o]!=-1)
        array[o]=array[++o];
        array[o-1]=-1;
        }
        x++;
        }
        i++;
        }
        System.out.println("\nThe array without duplicates :\t");
        i=0;
        while(array[i]!=-1)
        {
        System.out.print(""+array[i]+", ");
        i++;
        }
     
	}

}
