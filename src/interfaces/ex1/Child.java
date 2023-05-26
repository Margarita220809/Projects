package interfaces.ex1;

public class Child extends Parent implements GetInfo, Go{
    public void read(){
        System.out.println("Can't read");
    }
    public void listen(){
        System.out.println("Listen not carefully");
    }
    public void watch(){
        System.out.println("Watch Cartoons");
    }

    @Override
    public void IcanGo() {
        System.out.println("I cant walk good");
    }
}
