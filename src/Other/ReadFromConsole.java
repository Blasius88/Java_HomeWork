package Other;

import java.util.Scanner;

public class ReadFromConsole {
    public static String readFromConsoleStr(){
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    public static int readFromConsoleInt (){
        int num ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        return num;
    }

    public static double readFromConsoleDouble(){
        double num ;
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        return num;
    }
}
