import java.util.Scanner;

public class Combat{
    public static final int Level = 0;
	private static final int maxhp = 0;

	public static void fight(int playerhp) {
    	Scanner input = new Scanner(System.in);
        String action;
        String spellAction = null;
        System.out.println("An enemy approaches");
        buildEnemy();
        boolean fighting = true;
        while(fighting = true){
            System.out.println("Press 'a' to attack\nPress 'i' for info");
            Object charclass;
			if(charclass.equals("mage")){
                System.out.print("Press 's' for spells\n");
            }
            Object scan;
			action = input.nextLine();
            String xp;
			if(action.charAt(0) == 'a'){
                fighting = attack();
                if(fighting == false){
                    switch(Level){
                    case 1: 
                        xp = xp + 4;
                        break;
                    case 2:
                        xp = xp + 6;
                        break;
                    case 3:
                        xp = xp + 9;
                        break;
                    case 4:
                        xp = xp + 12;
                        break;
                    }
                    System.out.println("You earned :" + xp + " xp");
                    checkLevelUp();
                    return;
                }
                enemyattack();  
            }

            if(action.charAt(0) == 'i'){
                printStats();
                printEnemyStats();

            }
            if(action.charAt(0) == 's'){
            System.out.println("Press 'f' for fireball\nPress 'h' to heal\n");
            spellAction = input.nextLine();
            int mana;
			Object die;
			if(spellAction.charAt(0) == 'f'){
            if(((Object) die).roll10() > 2){
                mana = mana - 10;
                if(mana <0){
                    System.out.println("You don't have enough mana...");
                    mana = mana + 10;
                }else{
                int k = die.roll10(); 
                System.out.println("You hit for " + k + " damage!");
                int enemyhp = enemyhp - k;
                if(enemyhp <= 0){
                    System.out.println("You Won!"); 
                    switch(Level){
                    case 1: 
                        xp = xp + 4;
                        break;
                    case 2:
                        xp = xp + 6;
                        break;
                    case 3:
                        xp = xp + 9;
                        break;
                    case 4:
                        xp = xp + 12;
                        break;
                    }
                    System.out.println("You earned :" + xp + " xp");
                    checkLevelUp();
                    return;
                }
                enemyattack();  
                }
            }
            else{
                System.out.println("You miss!");
                enemyattack();
            }
            }else
            if(spellAction.charAt(0) == 'h'){
                mana = mana - 8;
                if(mana <0){
                    System.out.println("You don't have enough mana...");
                    mana = mana + 8;
                }else{
                    int x = ((Object) die).roll10();
                System.out.println("You heal your wounds...");
                System.out.println("+ " + x + " hp");
                playerhp = playerhp + x;
                if(playerhp>maxhp){
                    playerhp = maxhp;
                }
                enemyattack();  
            }
            }

    }
    }
    }

	private static void printEnemyStats() {
		
	}

	private static void printStats() {
		
	}

	private static void checkLevelUp() {
		
	}

	private static boolean attack() {
		return false;
	}

	private static void buildEnemy() {
		
	}

	private static void enemyattack() {
	
		
	}
    }