import java.util.Scanner;
public class lab3problem1 {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		   int intNum = 0; 
		   int totSum=0; 
		   int noEven=0;
		   int totNo=0 ;
		   double average=0.0;
		   System.out.println("Enter a positive integer, the input ends with a 0: ");
		   
		   do {
	       intNum = input.nextInt();      
	       if(intNum==0)                     
	    	   break;                        
	       if(intNum%2 == 0)           
	    	   	noEven++;          

	       totSum =totSum + intNum;          
	       totNo++;                                      

	              }while(true);

	              average = (float)totSum/(float)totNo;    
	       System.out.println("The number of even numbers: "+noEven);
	       System.out.println("The total sum: "+totSum);
	       System.out.println("The average is : "+String.format ("%.2f", average));        

	}

}
