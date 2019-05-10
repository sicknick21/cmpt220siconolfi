import java.util.Scanner;

public class Player {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
	        String charclass;
	        int num = 2;
	        while(num > 1){
	        System.out.println("Enter your Name: ");
	        String playerName = input.nextLine();
	        System.out.println("Choose your class: ");
	        System.out.println("'w' for warrior");
	        System.out.println("'a' for archer");
	        System.out.println("'m' for mage");
	        charclass = input.nextLine();
	        while(charclass.charAt(0) != 'w' && charclass.charAt(0) != 'a' && charclass.charAt(0) != 'm'){
	            System.out.println("'w' for warrior");
	            System.out.println("'a' for archer");
	            System.out.println("'m' for mage");
	            charclass = input.nextLine();
	        }
	        if(charclass.charAt(0) == 'w'){
	            buildWarrior();
	        }
	        if(charclass.charAt(0) == 'a'){
	            buildArcher();
	        }
	        if(charclass.charAt(0) == 'm'){
	            buildMage();
	        }
	        printStats();
	        int Level = 0;
			while(Level == 1){
	        fight();
	        }
	        System.out.println("This area is clear... time to move on\n");
	        while(Level == 2){
	            fight();
	        }
	        System.out.println("This area is clear... time to move on\n");
	        while(Level == 3){
	            fight();
	        }
	        System.out.println("This area is clear... time to move on\n");
	        while(Level == 4){
	            fight();
	        }
	        System.out.println("This area is clear... time to move on\n");
	        while(Level == 5){
	            fight();

	    }

	    }
	}

	private static void fight() {
		// TODO Auto-generated method stub
		
	}

	private static void printStats() {
		// TODO Auto-generated method stub
		
	}

	private static void buildMage() {
		// TODO Auto-generated method stub
		
	}

	private static void buildArcher() {
		// TODO Auto-generated method stub
		
	}

	private static void buildWarrior() {
		// TODO Auto-generated method stub
		
	}
}