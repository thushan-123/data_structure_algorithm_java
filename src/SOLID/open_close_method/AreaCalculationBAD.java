package SOLID.open_close_method;

import static java.lang.Math.PI;

public class AreaCalculationBAD {

    public double calculationArea(Object shape){
        if(shape instanceof Circle){
            return (double) PI * ((Circle) shape).radius * ((Circle) shape).radius;
        }else if(shape instanceof Rectangle){
            return (double) ((Rectangle) shape).length * ((Rectangle) shape).width;
        }
        return 0;
    }
}

// this code violate open close principle and single responsibility

// solution create interface -> shape and added to method area
