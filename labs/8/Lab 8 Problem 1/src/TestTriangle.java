
   public class TestTriangle {
       public static void main(String[] args) {
           Triangle my = new Triangle(1,1.5,1,"yellow", true);
           System.out.println("The area of the triangle is " +my.getArea());
           System.out.println("The perimeter of the triangle is " +my.getPerimeter());
           System.out.println("The color of the triangle is " +my.getColor());
           System.out.println("Is the triangle filled?" +my.isFilled());
       }
   }