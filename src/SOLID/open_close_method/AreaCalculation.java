package SOLID.open_close_method;

public class AreaCalculation {
    public double calculateArea(Shape shape){
        return (double) shape.area();
    }
}

// fix this open close principle and single responsibility

// use polymorphism (method overloading) for calculate area different shapes
