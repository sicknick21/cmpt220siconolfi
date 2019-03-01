import java.util.Scanner;
public class lab4problem6 {

	   public static void insert_at_end(int[] array,int value){
         int i=0;
         while(array[i]!=-1)
         {
         i++;
         }
         if(i==99999)
         {
          System.out.println("Array full.");
          
         }
             else
         {
            array[i]=value;
             array[i+1]=-1;   
         }
         }
       public static void insert_at_index(int[] array,int value,int position){

       int length=0,i=0;

       while(array[length]!=-1)
         {
         length++;
         }
       if(length==99999)
         {
         System.out.println("Array full.");
         }
         else
         {
           array[length+1]=-1;
       for(i=length;i>position;i--)
         {
           array[i]=array[i-1];
         }
           array[i]=value;
          }
         }
       public static void main(String args[]){
           int[] array=new int[99999];
            array[0]=-1;
           int i=0,temp;
           
           insert_at_end(array,1);
           insert_at_end(array,2);
           insert_at_end(array,3);
           insert_at_end(array,4);
           insert_at_end(array,5);
           insert_at_end(array,6);
           insert_at_end(array,7);
           insert_at_end(array,8);
           insert_at_end(array,9);
           insert_at_end(array,10);

           System.out.print("The array after inserting 1 to 10 is:\n\t");

           while(array[i]!=-1)
           {
        	   System.out.print(""+array[i]+", ");
        	   i++;
           }
           insert_at_index(array,10,3);
           insert_at_index(array,100,7);

           System.out.print("\nThe array after inserting 10 at 3 and 100 at 7 is:\n\t");

           i=0;

           while(array[i]!=-1)
           {
           System.out.print(""+array[i]+", ");
           i++;
           }
	}
}
