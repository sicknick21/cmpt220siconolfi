import java.text.DecimalFormat;
public class lab4problem1 {

	public static void main(String[] args) {
		DecimalFormat decfor = new DecimalFormat("000.00"); 
		System.out.print("\nin  cm    | cm  in");
		System.out.print("\n-------------------------------");
		for(int i=1,x=1;i<=50;){
		System.out.printf("\n%2d ",i);
		System.out.print(decfor.format(i*2.54));
		System.out.printf(" |%3d ",x);
		System.out.print(decfor.format(x*0.393701));
		i=i+1; 
		x=x+5; 
		}

	}

}
