
class BondTest {

   public static void main(String[] args) {

       Bond b = new Bond(500, 100, 0.05, 10000);
       System.out.printf("\n The price of the bond is: $%.2f \n", b.getPrice());
   }
}
