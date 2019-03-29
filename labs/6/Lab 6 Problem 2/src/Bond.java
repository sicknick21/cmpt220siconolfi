import java.lang.Math;

public class Bond {
  
	double coupon;
	int payments;
    double interest;
    double valueMaturity;
  
  
    Bond() { }
       
   public Bond(double coupon, int payments, double interest, double valueMaturity) {
      this.coupon = coupon;
      this.payments = payments;
      this.interest = interest;
      this.valueMaturity = valueMaturity;
   }
  

   public double getPrice() {
       double price;
      
      
       price = ( coupon * ( 1 - ( 1 / Math.pow(1+interest, payments) ) ) ) + ( valueMaturity * ( 1 / Math.pow(1+interest, payments) ) );
      
       return price;
   }  
}


