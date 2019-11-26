package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args){
        Input input = new Input();

        do{
            System.out.println("Please enter the radius of the circle: ");
            double radius = input.getDouble();

            Circle circle = new Circle(radius);
            System.out.println("Area: " + circle.getArea());
            System.out.println("Circumference: " + circle.getCircumference());

            System.out.println("Would you like to create another Circle?");
        }while (input.yesNo());

        System.out.println("Total circles created: " + Circle.getTotalCircles());
    }
}
