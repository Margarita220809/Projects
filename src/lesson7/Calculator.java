package lesson7;

public class Calculator {
    public static void dosmth(){
        System.out.println("do did done");
    }
//    public static void calculate(){
//        System.out.println("I can't calculate");
//    }
    public static void calculate(String text){
        System.out.println("I can't calculate");
        System.out.println("U insert text : " + text);
    }
    public static void calculate(int number1, int number2){
        System.out.println("1 parametr * 2 parametr = "+number1*number2);
    }
    public static void calculate(int number1, String text, int number2){
        calculate(number1, number2);
        calculate(text);
        dosmth();
    }

    public static void main(String[] args) {

        calculate(1, 2);
        calculate(2, "Hejka", 6);
    }
}
