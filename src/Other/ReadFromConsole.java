package Other;

import java.util.Scanner;

public class ReadFromConsole {
    public static String readFromConsoleStr(){
        String str = "";
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }
}
