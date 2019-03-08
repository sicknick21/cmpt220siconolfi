import java.util.*;
import java.lang.*;
import java.io.*;

public class project1{

			public static void main (String[] args){

				int height1 = 0;
				int width1= 0;
				int num = 0;
			Scanner input = new Scanner(System.in); 
			
			height1= input.nextInt();
			width1 = input.nextInt();
			num = input.nextInt();

			boolean complete = false;

			int width2 = 0;
			int height2 = 0;

			while (num!=0) {
				num--;
				int response = 0;
				response = input.nextInt();

				if (height2 < height1) {
					width2 += response;

					if (width2 == width1) {

						++height2;
						width2 = 0;
					}
					else if (width2 > width1) {
						height2 = height1 + 1;
						}

					if (height2 == height1)
						complete = true;
				}
			}

			if (complete)
				System.out.println("YES");

			else
				System.out.println("NO");
}
}