package inheritance2;

public class Messenger {
    public String name;
    public  double version;
    public int space;
    public void launch(){
        System.out.println("Your messenger opened");
    }
    public void shutdown(){
        System.out.println("Your messenger is closed");
    }
    public boolean canmakevideocall(){
        System.out.println("I cant make video calls");
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }
    public Messenger(String name, double version, int space){
        this.name = name;
        this.version = version;
        this.space = space;
    }
}
