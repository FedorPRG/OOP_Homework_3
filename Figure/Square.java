package Figure;

public class Square extends Figure {
    private double side;

    public Square() {

    }

    public Square(double side) {
        super.height = side;
        super.width = side;
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        super.height = side;
        super.width = side;
        this.side = side;
    }    

    @Override
    public Double getArea() {
        return height*width;
    }
}