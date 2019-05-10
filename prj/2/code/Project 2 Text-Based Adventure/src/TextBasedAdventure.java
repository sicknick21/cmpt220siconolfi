import java.util.*;
public class TextBasedAdventure {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    static Dice die = new Dice();
    public static String playerName;
    public static int playerhp;
    public static int maxhp;
    public static int maxmana;
    public static int mana;
    public static int playermeleedmg;
    public static int xp;
    public static int enemyhp;
    public static int enemymeleedmg;
    public static int Level;
    public static String charclass;
    public static boolean fighting = false; 

    private static void printStats() {
        if(charclass.equals("mage")){
            System.out.println(playerName + "\nhp: " + playerhp + "\nmana: " + mana + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");
        }else{
            System.out.println(playerName + "\nhp: " + playerhp + "\ndamage: " + playermeleedmg + "\nxp: " + xp + "\n");
        }
        }
    private static void printEnemyStats() {
        System.out.println("Enemy "+"\nhp: " + enemyhp + "\ndmg: " + enemymeleedmg + "\n");
    }

    private static void buildWarrior() {
        charclass = "warrior";
        maxhp = 20;
        playerhp = 20;
        playermeleedmg = 4;
        xp = 0;
        Level = 1; 
    }
    private static void buildArcher() {
        charclass = "archer";
        maxhp = 14;
        playerhp = 14;
        playermeleedmg = 6;
        xp = 0;
        Level = 1;
    }
    private static void buildMage() {
        charclass = "mage";
        maxhp = 10;
        playerhp = 10;
        mana = 20;
        maxmana = 20;
        playermeleedmg = 2;
        xp = 0;
        Level = 1; 
    }
    private static void buildEnemy() {
        switch(Level){
        case 1:
            enemyhp = 9;
            enemymeleedmg = 1;
            break;
        case 2:
            enemyhp = 19;
            enemymeleedmg = 4;
            break;
        case 3:
            enemyhp = 24;
            enemymeleedmg = 6;
            break;
        case 4:
            enemyhp = 32;
            enemymeleedmg = 7;
            break;
        case 5:
            enemyhp = 40;
            enemymeleedmg = 9;
            break; 
        }
    }
   

    private void checkLevelUp() {
        if(xp >= 100 && Level == 4){
            System.out.println("Level 5!");
            Level = Level + 1;
            maxhp = maxhp + 25;
            playerhp = maxhp;
            if(charclass.equals("mage")){
                maxmana = maxmana + 7;
                mana = maxmana;
            }
            playermeleedmg = playermeleedmg + 3;
            printStats();
        }else
        if(xp >= 50 && Level == 3){
            System.out.println("Level 4!");
            Level = Level + 1;
            maxhp = maxhp + 20;
            playerhp = maxhp;
            if(charclass.equals("mage")){
                maxmana = maxmana + 7;
                mana = maxmana;
            }
            playermeleedmg = playermeleedmg + 2;
            printStats();
        }else
        if(xp >= 25 && Level == 2){
            System.out.println("Level 3!");
            Level = Level + 1;
            maxhp = maxhp + 10;
            playerhp = maxhp;
            if(charclass.equals("mage")){
                maxmana = maxmana + 7;
                mana = maxmana;
            }
            playermeleedmg = playermeleedmg + 2;
            printStats();
        }else
        if(xp >= 10 && Level == 1){
            System.out.println("Level 2!");
            Level = Level + 1;
            maxhp = maxhp + 5;
            playerhp = maxhp;
            if(charclass.equals("mage")){
                maxmana = maxmana + 7;
                mana = maxmana;
            }
            playermeleedmg = playermeleedmg + 1;
            printStats();
        }

    }
    private void enemyattack() {
        if(die.roll6() > 2){
            System.out.println("Enemy hits!");
            playerhp = playerhp - enemymeleedmg;
            if(playerhp <= 0){
                gameover();
                System.exit(0);
            }
        }else{
            System.out.println("Enemy Misses!");
        }       
    }
    private boolean attack() {
        if(die.roll6() > 2){
            System.out.println("You hit!");
            enemyhp = enemyhp - playermeleedmg;
            if(enemyhp <= 0){
                System.out.println("You Won!"); 
                return false; 
            }
        }else{
            System.out.println("You miss!");
        }
        return true;
    }

    private void gameover() {
        System.out.println(playerName + " Died!") ;
        System.out.println("Game Over!");
        System.exit(0); 
        return;
    }
}





