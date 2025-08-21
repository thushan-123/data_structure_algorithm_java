package SOLID.liskov_subsitution;

public class Sparrow extends Bird implements Flyable{

    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void eat() {
        super.eat();
    }
}
