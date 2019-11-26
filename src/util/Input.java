package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    String getString(){
        System.out.println("Enter a string: ");

        return scanner.nextLine();
    }

    public boolean yesNo(){
        //System.out.println("Enter yes or no: ");
        String response = scanner.next();
        response.trim();
        response.toLowerCase();

        return response.equalsIgnoreCase("y") || response.equalsIgnoreCase("yes");
    }

    int getInt(int min, int max){
        System.out.printf("Please provide an integer between %d and %d%n", min, max);
        int number = scanner.nextInt();

        if(number < min || number > max){
            System.out.println("Number out of range..");
            return getInt(min, max);
        }

        return number;
    }

    int getInt(){
        System.out.println("Please enter an integer: ");

        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        System.out.printf("Please provide a double between %f and %f%n", min, max);
        double number = scanner.nextDouble();

        if(number < min || number > max){
            System.out.println("Number out of range..");
            return getDouble(min, max);
        }

        return number;
    }

    public double getDouble(){
        //System.out.println("Please enter a double: ");

        return scanner.nextDouble();
    }
}
