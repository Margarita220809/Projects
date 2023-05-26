package STATIC.ex4;

public class ClassD extends ClassC{
    public ClassD(){
        System.out.println("Konstructor classy D");
    }
    {
        System.out.println("Dynamiczny block classy D");
    }
    static {
        System.out.println("Konstructor classy D");
    }
}
