package abstractClass;

public  class Ship extends Vehicles implements Inter1, Inter2{
    @Override
    public void inter(){
        System.out.println("inter");
    }

    @Override
    void move() {
        System.out.println("Boat swim");
    }
}
