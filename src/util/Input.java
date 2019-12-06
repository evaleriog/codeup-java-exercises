package util;

import java.util.Scanner;

public class Input{
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
        int number = 0;
        System.out.printf("Please provide an integer between %d and %d%n", min, max);

        try{
            String input = scanner.nextLine();
            input = input.trim();
            number = Integer.valueOf(input);

        }catch (NumberFormatException e){
            System.out.println("Please enter an integer...");
            return getInt(min, max);
        }

        if(number < min || number > max){
            System.out.println("Number out of range...");
            return getInt(min,max);
        }

        return number;



//        int number = scanner.nextInt();
//
//        if(number < min || number > max){
//            System.out.println("Number out of range..");
//            return getInt(min, max);
//        }
//
//        return number;
    }

    int getInt(){
        System.out.println("Please enter an integer: ");

        return scanner.nextInt();
    }

    double getDouble(double min, double max){
        double number = 0;
        System.out.printf("Please provide an double between %f and %f%n", min, max);

        try{
            String input = scanner.nextLine();
            input = input.trim();
            number = Double.valueOf(input);

        }catch (NumberFormatException e){
            System.out.println("Please enter an double...");
            return getDouble(min, max);
        }

        if(number < min || number > max){
            System.out.println("Number out of range...");
            return getDouble(min,max);
        }

        return number;
//        double number = scanner.nextDouble();
//
//        if(number < min || number > max){
//            System.out.println("Number out of range..");
//            return getDouble(min, max);
//        }
//
//        return number;
    }

    public double getDouble(){
        //System.out.println("Please enter a double: ");

        return scanner.nextDouble();
    }

    public int getBinary(){
        int number = 0;

        try{
            System.out.println("Please enter a binary number to convert:");
            String res = scanner.nextLine();
            res = res.trim();
            number = Integer.valueOf(res, 2);
        }catch (NumberFormatException e){
            System.out.println("Not a correct binary format...");
        }

        return number;
    }

    public int getHex(){
        int number = 0;

        try{
            System.out.println("Please enter a hexadecimal number to convert:");
            String res = scanner.nextLine();
            res = res.trim();
            number = Integer.valueOf(res, 16);
        }catch (NumberFormatException e){
            System.out.println("Not a correct hexadecimal format...");
        }

        return number;
    }
}
