public class Square {

   double width;
   public Square() {

       width = 1;
   }
   public Square(double width) {

       this.width = width;
   }
   public double getWidth() {

       return width;
   }
   public void setWidth(double width) {

       this.width = width;

   }
   public String toString() {
       return "Square with side = " + width;

   }
   public double getPerimeter() {
       return 4 * width;

   }
   public double getArea() {
       return width * width;

   }


}
