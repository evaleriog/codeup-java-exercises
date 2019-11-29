package shapes;

public class Rectangle {
    protected int length;
    protected  int width;

    public Rectangle(int width, int length){
        this.width = width;
        this.length = length;
    }

    public  int getArea(){
        return this.length * this.width;
    }

    public  int getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }
}