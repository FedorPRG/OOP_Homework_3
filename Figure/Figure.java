package Figure;
public abstract class Figure {
    protected double width;
    protected double height;

    public double getArea() {
        return width * height;
    }
}