package exceptions;

import java.util.Scanner;

public class InsertName {
    public void insertName() throws NoSuchEmailException{
        String mail = "Margaret220809@gmail.com";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur email");
        String email = in.nextLine();

        if (email.equals(mail)) {
            throw new NoSuchEmailException();

        }
        System.out.println("Approved");
    }
    public static void main(String[] args) {
        String mail = "Margaret220809@gmail.com";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter ur email");
        String email = in.nextLine();
        try {
            if (email.equals(mail)) {
                throw new NoSuchEmailException();
            }
            System.out.println("Ur email approved");
        } catch (NoSuchEmailException e){
            System.out.println(e.getMessage());
        }
    }
}
