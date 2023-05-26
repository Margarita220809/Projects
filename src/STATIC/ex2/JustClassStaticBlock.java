package STATIC.ex2;

public class JustClassStaticBlock {
    static String day;
    static {
        day = "XXXXXX";
        System.out.println("I love "+ day);
    }
    static void thisisMonday(){
        day = "Monday";
        System.out.println("But today I love " + day);
    }
    static {
        day = "Tuesday";
        System.out.println("Today is " + day);
    }
}
