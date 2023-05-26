package STATIC.ex1;

public class JustClass {
    public static String staticString;
    public static int staticint;
    public String noneStaticstring;
    public int noneStaticint;
    public static void staticMethod(){
        System.out.println("Static method");

     }
    public void nonestaticMethod(){
        System.out.println("None static method");
        staticMethod();
        System.out.println(staticint + noneStaticint);
    }

}
