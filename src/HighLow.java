import java.lang.Math;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int test = (int) (Math.random() * (100 - 1 + 1)) + 1;

        int counter = 1;

        do{
            if (counter == 5) {
                System.out.println("Your half way your number of tries");
            }else if(counter == 9){
                System.out.println("Only two more chances");
            }else

            System.out.println("Please try to guess a number from 1 to 100.");
            int userGuess = in.nextInt();

            if(userGuess == test){
                System.out.println("GOOD GUESS!");
                break;
            }else if(userGuess < test){
                System.out.println("HIGHER");
                counter++;
            }else if(userGuess > test){
                System.out.println("LOWER");
                counter++;
            }else {
                counter++;
            }

        }while (counter < 11);
        System.out.println("Counter " + counter);
    }
}
