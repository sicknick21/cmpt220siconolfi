public class TestCircle {

   public static void main(String[] args) {
       Circle circle = new Circle(2, 2, 5.5);
       System.out.println("Area is " + circle.getArea());
       System.out.println("Perimeter is " + circle.getPerimeter());

       Circle otherCircle1 = new Circle(3 ,3, 0);
       System.out.println(circle.contains(otherCircle1.getX(), otherCircle1.getY()));

       Circle otherCircle2 = new Circle(4, 5, 10.5);
       System.out.println(circle.contains(otherCircle2));

       Circle otherCircle3 = new Circle(3, 5, 2.3);
       System.out.println(circle.overlaps(otherCircle3));
   }

}