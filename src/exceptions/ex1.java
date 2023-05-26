package exceptions;

public class ex1 {
    public static void main(String[] args) {
        int[] count = new int[5];
        try {
            System.out.println(count[12]);
        }catch (ArrayIndexOutOfBoundsException name){
            System.out.println(name.getMessage());
        }finally {
            System.out.println("Blok finally");
        }
        System.out.println("Message");
    }
}
