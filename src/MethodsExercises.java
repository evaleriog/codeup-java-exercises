import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {

    //1. Basic Arithmetic
    public static int Addition(int a, int b){
        return a + b;
    }

    public static int Substraction(int a, int b){
        return a - b;
    }

    public static int Multiplication(int a, int b){
        return a * b;
    }

    public static int Division(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }else{
            return a / b;
        }
    }

    public static int Modulus(int a, int b){
        if(a == 0 || b == 0){
            return 0;
        }else{
            return a % b;
        }
    }

    public static int multiplicationBonus(int a, int b){

        if(b == 0){
            return  0;
        }

        return a + multiplicationBonus(a, b-1);
    }

    // 2. Create a method that validates that user input is in a certain range
    public static int getInteger(int min, int max){
        Scanner in = new Scanner(System.in);

        int number = in.nextInt();

        if(number >= min && number <= max){
            return number;
        }else {
            System.out.printf("Enter a number between %d and %d: ", min, max);
        }

        return getInteger(min, max);
    }

    // 3. Calculate the factorial of a number
//    public static long factorial(int num){
//
//        System.out.printf("%d! = ", num);
//        long result = 1;
//
//        if(num > 0 && num < 21){
//            for(int x = 1; x <= num; x++){
//                result *= x;
//
//                if(x == num){
//                    System.out.printf("%d = %,d%n", x, result);
//                }else {
//                    System.out.printf("%d X ", x);
//                }
//            }
//        }else {
//            result = num;
//        }
//
//        return result;
//    }

    public static long factorial(int num, String response){
        if(num == 0){
            System.out.printf("%s", response);
            return 1;
        }

        if(num == 1){
            response = num + " " + response;
        }else {
            response = "X " + num + " " + response;
        }

        return num * factorial(num -1, response);
    }

    // 4. Create an application that simulates dice rolling.
    public static void rollDice(int side){
        int dice1 = (int) (Math.random() * (side - 1 + 1)) + 1;
        int dice2 = (int) (Math.random() * (side - 1 + 1)) + 1;

        System.out.printf("You rolled %d from Dice 1 and rolled %d from Dice 2.%n", dice1, dice2);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("5 + 4 = " + Addition(5,4));
        System.out.println("6 + 90 = " + Addition(6,90));
        System.out.println("9 - 5 = " + Substraction(9,5));
        System.out.println("3 - 8 = " +Substraction(3,8));
        System.out.println("4 * 5 = " +Multiplication(4,5));
        System.out.println("9 * 6 = " +Multiplication(9,6));
        System.out.println("4 / 2 = " +Division(4,2));
        System.out.println("6 / 0 = " +Division(6,0));
        System.out.println("8 % 3 = " +Modulus(8,3));
        System.out.println("6 % 0 = " +Modulus(6,0));
        System.out.println("5 * 5 = " +multiplicationBonus(5,5));
        System.out.println("2 * 3 = " +multiplicationBonus(2,3));
        System.out.println("10 * 9 = " +multiplicationBonus(10,9));

        System.out.println("Enter a number between 1 and 10");
        int userInput = getInteger(1, 10);
        System.out.println(userInput);


//        String response = "yes";
//
//        do{
//            System.out.println("Enter a number between 1 and 20 to find its factorial: ");
//            factorial(sc.nextInt());
//
//            System.out.println("Do you want to continue:");
//            response = sc.next();
//        }while(response.equalsIgnoreCase("yes"));
        String response = "yes";
        String output = "";

        do{
            System.out.println("Enter a number between 1 and 20 to find its factorial: ");
            long number = factorial(sc.nextInt(),output);
            System.out.println(number);
            System.out.println(output);

            System.out.println("Do you want to continue:");
            response = sc.next();
        }while(response.equalsIgnoreCase("yes"));

        String keepRolling = "yes";

        do{
            System.out.println("Please enter the number of sides for a pair of dice: ");
            int numSides = sc.nextInt();
            rollDice(numSides);
            System.out.println("Do you want to roll the dice again?");
            keepRolling = sc.next();

        }while(keepRolling.equalsIgnoreCase("yes"));



    }



}


