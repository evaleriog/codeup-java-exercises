package codeup;
import java.util.HashMap;
import java.util.Scanner;

public class MenuCalculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int[] many = new int[9];
        HashMap<String, String> menu = new HashMap<>();
        menu.put("Chicken Strips", "3.50");
        menu.put("French Fries", "2.50");
        menu.put("Hamburger", "4.00");
        menu.put("Hotdog", "3.50");
        menu.put("Large Drink", "1.75");
        menu.put("Medium Drink", "1.50");
        menu.put("Milk Shake", "2.25");
        menu.put("Salad", "3.75");
        menu.put("Small Drink", "1.25");

        System.out.println("Please enter your order");
        String order = in.nextLine();
        order = order.trim();

        String[] eachOrder = order.split("");
        double total = 0;

        for(String ind: eachOrder){
            switch (ind){
                case "1":
                    total += Double.valueOf(menu.get("Chicken Strips")) ;
                    many[0] = many[0] + 1;
                    break;
                case "2":
                    total += Double.valueOf(menu.get("French Fries"));
                    many[1] = many[1] + 1;
                    break;
                case "3":
                    total += Double.valueOf(menu.get("Hamburger"));
                    many[2] = many[2] + 1;
                    break;
                case "4":
                    total += Double.valueOf(menu.get("Hotdog"));
                    many[3] = many[3] + 1;
                    break;
                case "5":
                    total += Double.valueOf(menu.get("Large Drink"));
                    many[4] = many[4] + 1;
                    break;
                case "6":
                    total += Double.valueOf(menu.get("Medium Drink"));
                    many[5] = many[5] + 1;
                    break;
                case "7":
                    total += Double.valueOf(menu.get("Milk Shake"));
                    many[6] = many[6] + 1;
                    break;
                case "8":
                    total += Double.valueOf(menu.get("Salad"));
                    many[7] = many[7] + 1;
                    break;
                case "9":
                    total += Double.valueOf(menu.get("Small Drink"));
                    many[8] = many[8] + 1;
                    break;
            }
        }

        for(int x=0; x < many.length; x++) {
            if(many[x] != 0){
                switch (x){
                    case 0:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Chicken Strips", menu.get("Chicken Strips"));
                        break;
                    case 1:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "French Fries", menu.get("French Fries"));
                        break;
                    case 2:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Hamburger",menu.get("Hamburger") );
                        break;
                    case 3:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Hotdog",menu.get("Hotdog") );
                        break;
                    case 4:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Large Drink",menu.get("Large Drink") );
                        break;
                    case 5:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Medium Drink", menu.get("Medium Drink"));
                        break;
                    case 6:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Milk Shake",menu.get("Milk Shake") );
                        break;
                    case 7:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Salad",menu.get("Salad") );
                        break;
                    case 8:
                        System.out.printf("%2d %13s $%-4s%n", many[x], "Small Drink",menu.get("Small Drink") );
                        break;
                }
            }

        }

        System.out.println("-----------------------");
        System.out.printf("%16s $%-4.2f","Your total is:" ,total);
    }
}
