package lesson7;

public class Recursion {
    static void printAllNumbers(int number){
        if(number == 0){
            System.out.println("U insert 0");
        } else if (number < 0) {
            System.out.println("U insert minus");
        }else {
            System.out.println(number);
            number --;
            printAllNumbers(number);
        }

    }

    public static void main(String[] args) {
        printAllNumbers(7);
    }
}
