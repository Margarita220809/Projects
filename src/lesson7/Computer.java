package lesson7;

public class Computer {
    public String name;
    public int price;
    public int ram;
    public int video;
    public boolean mouseInclude;

    public String getName(){
        return name;
    }
    public void setName(String str){
        this.name = str;
    }
    public int plus (int number1, int number2){
        return number1+number2;
    }
    public String hello(){
        String hello = "Hello world";
        return hello;
    }
    public boolean getMouseInclude(){
        return mouseInclude;
    }
    public void setMouseInclude(boolean mouse){
        this.mouseInclude = mouse;
    }

}
