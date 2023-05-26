package STATIC.ex4;

public class ClassC extends ClassB{
    public ClassC(){
        System.out.println("Konstructor classy C");
    }
    {
        System.out.println("Dynamiczny block classy C");
    }
    static {
        System.out.println("Konstructor classy C");
    }
}
