package SOLID.open_close_method;

public class Rectangle implements Shape{
    double width;
    double length;

    @Override
    public double area() {
        return (double) width * length;
    }
}
