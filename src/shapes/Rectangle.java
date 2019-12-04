package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
//    protected int length;
//    protected  int width;
//
//    public Rectangle(int width, int length){
//        this.width = width;
//        this.length = length;
//    }
//
//    public  int getArea(){
//        return this.length * this.width;
//    }
//
//    public  int getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
    public Rectangle(double length, double width){
        super(length, width);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

//    @Override
//    public double getArea() {
//        return super.getArea();
//    }

//    @Override
//    public double getPerimeter() {
//        return super.getPerimeter();
//    }
}
