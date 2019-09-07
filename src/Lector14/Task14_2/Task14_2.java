package Lector14.Task14_2;

import Other.ReadFromConsole;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14_2 {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        String text = ReadFromConsole.readFromConsoleStr();
        findHex(text);
    }

    private static void findHex(String text) {
        String str = "";
        int a = 0;
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            str = String.valueOf(arr[i]);
            Pattern pattern = Pattern.compile("[0-9A-F*]");
            Matcher check_ = pattern.matcher(str);
            if (check_.find()) {
                Pattern pattern1 = Pattern.compile("[a-z*]");
                Matcher check = pattern1.matcher(str);
                if (!check.find()) {
                    System.out.println(arr[i]);
                    a++;
                }
            }
        }
        if (a == 0)
            System.out.println("нет 16 чисел в тексте");
    }
}
