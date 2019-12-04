package shapes;

public class ShapesTest {

    public static void main(String[] args){
//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println("Perimeter: " + box1.getPerimeter());
//        System.out.println("Area: " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("Perimeter: " + box2.getPerimeter());
//        System.out.println("Area: " + box2.getArea());
        Measurable myShape;

        myShape = new Square(23.34);
        System.out.println("Square Perimeter: " + myShape.getPerimeter());
        System.out.println("Square Area: " + myShape.getArea());
        myShape = new Rectangle(23.4, 12.3);
        System.out.println("Rectangle Area: " + myShape.getArea());
        System.out.println("Rectangle Perimeter: " + myShape.getPerimeter());

    }
}
