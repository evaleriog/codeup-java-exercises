import java.util.Scanner;
import java.lang.Math;

public class ConsoleAdventureGame {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String player;

        System.out.println("Enter your name:");
        player = in.nextLine();
        player = player.trim();

        System.out.printf("Welcome %s, Let's start the adventure!%n", player);
        int playerHealth = 100;
        final int playerAttack = 30;

        String enemy = "Enemy";
        int enemyHealth = 100;
        final int enemyAttack = 20;

        do{
            if(playerHealth <= 0){
                break;
            }else {
                System.out.println("Choose how to attack your opponent: (punch, kick, superkick)");
                String selection = in.next();
                selection = selection.trim();
                selection = selection.toLowerCase();
                System.out.println(selection);
                int attackSelection = 0;

                if(selection.equalsIgnoreCase("punch")){
                    attackSelection = 1;
                }else if(selection.equalsIgnoreCase("kick")){
                    attackSelection = 2;
                }else if(selection.equalsIgnoreCase("superkick")){
                    attackSelection = 3;
                }

                int yourAttack = playerAttack(attackSelection);
                System.out.println(yourAttack);

                enemyHealth -= yourAttack;

                System.out.printf("You throw %d damage into your enemy.....%n", yourAttack);
                System.out.printf("%s has now %d of Health.....%n%n", enemy, enemyHealth);
            }

            if(enemyHealth <= 0){
                break;
            }else{

                int randomEnemyAttack = (int)(Math.random() * 3 - 1 + 1) + 1;
                int yourEnemyAttack = enemyAttack(randomEnemyAttack);

                System.err.println("\nYour enemy is going to attack you now.....Prepare\n");

                playerHealth -= yourEnemyAttack;

                System.err.printf("Your enemy throw %d damage to you.....%n", yourEnemyAttack);
                System.err.printf("%s has now %d of Health.....%n%n", player, playerHealth);
            }

        }while(playerHealth > 0 && enemyHealth > 0);

        if(playerHealth > 0){
            System.out.printf("%s has won the battle...%n", player);
        }else if(enemyHealth > 0){
            System.out.printf("%s has won the battler....GAME OVER!!!%n", enemy);
        }

        System.out.println("Player: " + playerHealth);
        System.out.println("Enemy: " + enemyHealth);
    }

    public static int playerAttack(int attack){
        int max = 0;
        int min = 0;

        if(attack == 1){
            max = 5;
            min = 1;
        }else if(attack == 2){
            max = 6;
            min = 3;
        }else if(attack == 3){
            max = 10;
            min = 5;
        }

        int range = max - min + 1;
        int generatedAttack = (int) (Math.random() * range) + min;

        return  generatedAttack;
    }

    public static int enemyAttack(int attack){
        int max = 0;
        int min = 0;

        if(attack == 1){
            max = 3;
            min = 1;
        }else if(attack == 2){
            max = 5;
            min = 2;
        }else if(attack == 3){
            max = 8;
            min = 4;
        }

        int range = max - min + 1;
        int enemyAttack = (int)(Math.random() * range) + min;

        return enemyAttack;
    }

}
