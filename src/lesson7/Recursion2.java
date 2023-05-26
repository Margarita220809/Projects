package lesson7;

public class Recursion2 {
    static void credit(int creditsum, int creditwznos){
        System.out.println(creditsum);
        creditsum-=creditwznos;
        if (creditsum < 0){
            System.out.println("U made 0 of ur credit!");
        }else {
        credit(creditsum, creditwznos);}
    }
    static void credit(int creditsum){
        int sum = 200;
        System.out.println(creditsum);
        creditsum-=sum;
        if (creditsum < 0){
            System.out.println("U made 0 of ur credit!");
        }else {
            credit(creditsum, sum);}
    }

    public static void main(String[] args) {
        credit(20000, 500);
        credit(1000);
    }
}
