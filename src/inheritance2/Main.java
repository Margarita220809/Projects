package inheritance2;

public class Main {
    public static void main(String[] args) {
//        ChildClass child = new ChildClass();
//        child.tosmth();
        Telegram tel = new Telegram(300);
//        tel.shutdown();
        Messenger messenger = new Messenger("Messenger", 1.0, 250);
        System.out.println(messenger.getName()+messenger.getSpace()+messenger.getVersion());
        tel.shutdown("Hello");
        tel.getInfo();
    }
}
