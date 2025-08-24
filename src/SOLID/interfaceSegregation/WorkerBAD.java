package SOLID.interfaceSegregation;

interface WorkerBAD {
    public void work();
    public void eat();
}


// Workers are two types  Human Robot

// but issue is Robot does not eat

// Robot class implement the WorkerBAD calas  violate the interface segregation principle

// solution is work and eat method added to separate interfaces