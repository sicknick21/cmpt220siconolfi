import java.util.Random;
public class lab4problem5 {

	public static void main(String[] args) {
		  double average=0;
	      int[] a=new int[1000];
	        Random random = new Random();

	    for(int i=0;i<1000;i++)
	        {
	            a[i] = random.nextInt(10000);
	      
	            average=average+a[i];
	        }
	        average=average/1000.0;
	        int count1=0,count2=0;
	    for(int i=0;i<1000;i++)
	    {
	        if(a[i]<average)
	        count1++;
	        if(a[i]>average)
	        count2++;
	    }
	    System.out.println("The total integers that are lower than the average are "+count1);
	    System.out.println("The total integers that are larger than the average are "+count2);

	}

}
