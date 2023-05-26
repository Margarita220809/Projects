package abstractClass;

public abstract class Vehicles {
    String name;
    void takeFuel(){
        System.out.println("I tanked the car");
    }
    abstract void move();
    abstract void inter();
}
