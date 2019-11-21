import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class ConsoleExercises {
    public static void main(String[] args){
        double pi = 3.14159;

        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner in = new Scanner(System.in);
        in.useDelimiter("\n");
        //Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        System.out.print("Enter a number: ");
        int userInput = in.nextInt();
        System.out.println("user number input: " + userInput);

        //Prompt a user to enter 3 words, and store each of them in a separate variable. Then, display them back in the console, each on a newline.
        System.out.println("Please enter 3 words");
        String first = in.next();
        String second = in.next();
        String third = in.next();
        System.out.println("First word: " + first);
        System.out.println("Second word: " + second);
        System.out.println("Third word: " + third);
        in.nextLine();
        //Prompt a user to enter a sentence, then store that sentence in a String variable using the next method. Then, display that sentence back to the user
        System.out.println("Please enter a sentence: ");
        //String mySentence = in.next();
        String mySentence = in.nextLine();
        System.out.println("Sentence: " + mySentence);

        System.out.println("Enter values of length, width and height.");
//        int length = Integer.parseInt(in.nextLine());
//        int width = Integer.parseInt(in.nextLine());
//        int areaRectangle = length * width;
//        int perimeterRectangle = (2 * length) + (2 * width);

        float length = Float.parseFloat(in.nextLine());
        float width = Float.parseFloat(in.nextLine());
        float heigth = Float.parseFloat(in.nextLine());
        float areaRectangle = (length * width);
        float perimeterRectangle = (2 * length) + (2 * width);
        float volumeRectangle = length * width * heigth;

        System.out.printf("The area of the rectangle is: %,.2f%nThe perimeter is : %,.2f%nThe volume of the rectangle is: %,.2f",areaRectangle,perimeterRectangle, volumeRectangle);
    }
}
