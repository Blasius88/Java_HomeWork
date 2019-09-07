package Lector14.Task14_1;

import Other.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Task14_1Main {
    public static void main(String[] args) {
        System.out.println("Введите email");
        String email = ReadFromConsole.readFromConsoleStr();
        arrSort(email);
    }

    public static void arrSort(String email) {
        Pattern pattern = Pattern.compile("@");
        Matcher check = pattern.matcher(email);
        if (check.find()) {
            String[] str = email.split("@");
            char[] chars = str[0].toCharArray();
            String char0 = String.valueOf(chars[0]);
            Pattern pattern1 = Pattern.compile("[\\d\\s_()]");
            Matcher check_ = pattern1.matcher(char0);
            if (check_.find())
                err();
            else {
                String char2 = str[1];
                boolean check2 = check(char2);
                if (check2) {
                    System.out.println("правельно введен email");
                } else
                    err();
            }
        } else
            err();
    }

    private static void err() {
        System.out.println("Неправельно введен email");
    }

    private static boolean check(String char2) {
        boolean check_ = false;
        String[] arr = char2.split("\\.");
        String str = String.valueOf(arr[1]);
        Pattern pattern = Pattern.compile("com");
        Pattern pattern1 = Pattern.compile("org");
        Matcher check2 = pattern.matcher(str);
        Matcher check3 = pattern1.matcher(str);
        if (check2.find() || check3.find())
            check_ = true;
        return check_;
    }
}