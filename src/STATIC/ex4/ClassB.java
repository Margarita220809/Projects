package STATIC.ex4;

public class ClassB extends ClassA{
    public ClassB(){
        System.out.println("Konstructor classy B");
    }
    {
        System.out.println("Dynamiczny block classy B");
    }
    static {
        System.out.println("Konstructor classy B");
    }
}
