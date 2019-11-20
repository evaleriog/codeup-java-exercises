import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner in = new Scanner(System.in);
        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        System.out.print("Enter a number: ");
//        int userInput = in.nextInt();
//        System.out.println("userInput: " + userInput);

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
//        System.out.println("Please enter 3 words");
//        String first = in.next();
//        String second = in.next();
//        String third = in.next();
//        System.out.println("First: " + first);
//        System.out.println("Second: " + second);
//        System.out.println("Third: " + third);

        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user
        System.out.println("Please enter a sentence: ");
        //String mySentence = in.next();
        String mySentence = in.nextLine();
        System.out.println(mySentence);
    }
}
