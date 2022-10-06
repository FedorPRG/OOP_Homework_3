package Figure;
public class Rectangle extends Figure {

    public Rectangle() {

    }

    public Rectangle(double height, double width) {
        super.height = height;
        super.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}