import java.util.Random;
public class lab2problem6 {

	public static void main(String[] args) {
		Random random = new Random();
        int num1 = random.nextInt(8) + 2;
        int num2 = random.nextInt(10);
        int num3 = random.nextInt(10);
        int num4 = random.nextInt(10);
        int num5 = random.nextInt(10);
        int num6 = random.nextInt(10);
        int num7 = random.nextInt(10);
        int num8 = random.nextInt(10);
        int num9 = random.nextInt(10);
        int num10 = random.nextInt(10);
        String phonenumber = String.format("(%d%d%d)%d%d%d-%d%d%d%d", num1, num2, num3, num4, num5, num6, num7, num8, num9, num10);
        System.out.println(phonenumber);

	}

}
