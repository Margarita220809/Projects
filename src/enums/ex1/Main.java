package enums.ex1;

import java.net.DatagramSocket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Insert the platform");
        String plat = in.nextLine();
        if(plat.equals(Platform.ANDROID.getName())){
            System.out.println("Started Android");
        }

    }

}
