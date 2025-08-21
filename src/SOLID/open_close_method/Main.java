package SOLID.open_close_method;

public class Main {
    public static void main(String[] args) {
        AreaCalculation areaCalculation = new AreaCalculation();

        Circle circle = new Circle();
        circle.radius = 10;

        System.out.println("circle area: " + areaCalculation.calculateArea(circle));

        Rectangle rectangle = new Rectangle();
        rectangle.length = 10;
        rectangle.width = 20;
        System.out.println("rectangle area: " + areaCalculation.calculateArea(rectangle));
    }
}
