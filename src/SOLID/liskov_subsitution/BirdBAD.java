package SOLID.liskov_subsitution;

public class BirdBAD {
    void fly() {
        System.out.println("fly");
    }
}

class OstrichBAD extends BirdBAD{
    @Override
    void fly() {
        throw new UnsupportedOperationException();
    }
}

// BirdBAD class violate the liskov substitution ( Ostrich extent BirdBAD class -> breakdown the parent class fn)

// create the separate interface for fly method