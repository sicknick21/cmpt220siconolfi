public class Circle {
   
	double x;
    double y;
    double radius;


   public Circle()
   {
       x = 0;
       y = 0;
       radius = 1;
   }

   Circle(double x, double y, double radius)
   {
       this.x = x;
       this.y = y;
       this.radius = radius;
   }

   public double getX()
   {
       return x;
   }

   public double getY()
   {
       return y;
   }

   public double getRadius()
   {
       return radius;
   }

   public double getArea()
   {
       return Math.PI * radius * radius;
   }

   public double getPerimeter()
   {
       return 2 * Math.PI * radius;
   }

   public boolean contains(double x, double y)
   {
       double distance = Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
       if (distance < radius)
           return true;
       else
           return false;
   }
   public boolean contains(Circle circle)
   {
       double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
       if (distance <= Math.abs(radius - circle.getRadius()))
               return true;
       else
           return false;
   }

   public boolean overlaps(Circle circle)
   {
       double distance = Math.sqrt(Math.pow(circle.getX() - this.x, 2) + Math.pow(circle.getY() - this.y, 2));
       if(distance <= radius + circle.getRadius())
           return true;
       else
           return false;
   }
}