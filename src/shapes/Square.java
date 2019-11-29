package shapes;

public class Square extends Rectangle {
    private int side;

    public Square(int side){
        super(side, side);
        this.side = side; //to set side when getPerimeter and getArea are called
    }

    public int getPerimeter(){
        return 4 * this.side;
    }

    public int getArea(){
        return this.side * this.side;
    }

}
