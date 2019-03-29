
public class TestSquare {

	   public static void main(String args[]) {

	       Square s1 = new Square(40);
	       Square s2 = new Square(35.9);

	       System.out.println("The width of Square 1 is: " + s1.getWidth());
	       System.out.println("The area of Square 1 is: " + s1.getArea());
	       System.out.println("The perimeter of Square 1 is: " + s1.getPerimeter());

	       System.out.println();

	     
	       System.out.println("The width of Square 2 is: " + s2.getWidth());
	       System.out.println("The area of Square 2 is: " + s2.getArea());
	       System.out.println("The perimeter of Square 2 : " + s2.getPerimeter());

	   }
}