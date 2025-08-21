package SOLID.liskov_subsitution;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        System.out.println("sparrow");
        sparrow.eat();
        sparrow.fly();

        System.out.println("Ostrich");
        Ostrich ostrich = new Ostrich();
        ostrich.eat();

    }
}
