package inheritance2;

public class Telegram extends Messenger{
    public Telegram(int space){
        super("Telegram", 1.0, space);
    }
    @Override
    public void launch(){
        System.out.println("Your Telegram opened");
    }
    public void shutdown(String s){
        System.out.println("Your Telegram is closed");
    }
@Override
    public boolean canmakevideocall(){
        System.out.println("I can make video calls");
        return true;
    }
    public void getInfo(){
        System.out.println("Name of priloznia " + super.getName());
        System.out.println("Version of priloznia " + super.getVersion());
        System.out.println("Space of priloznia " + super.getSpace());
    }

    }

