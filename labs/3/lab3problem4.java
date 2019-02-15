
public class lab3problem4 {

	public static void main(String[] args) {
		int n;
		for(n=15000;n>0;n--)
		
		{ int c=0;
		for(int i=1;i<=n;i++)
		{
		if(n%i==0)
		{
		c++;
		}
		}
		if(c==2)
		break;
		}
		System.out.println("Largest n, which is prime, and is less than 15000 is: "+n);
	}

}
