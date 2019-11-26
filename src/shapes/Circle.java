package shapes;

public class Circle {
    private double radius;
    private static int counter;

    public Circle(double radius){
        this.radius = radius;
        this.counter++;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public static int getTotalCircles(){
        return counter;
    }
}
