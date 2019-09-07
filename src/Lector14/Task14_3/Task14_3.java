package Lector14.Task14_3;

import Other.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task14_3 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        String str = ReadFromConsole.readFromConsoleStr();
        findTag(str);
    }

    private static void findTag(String str) {
        String[] arrStr = str.split(" ");
        String str_ = "";
        int a = 0;
        /*Pattern pattern = Pattern.compile("(<p.*>)");
        Matcher matcher = pattern.matcher(str);
        while (matcher.find())
        {
            int start=matcher.start();
            int end=matcher.end();
            System.out.println("Найдено совпадение " + str.substring(start,end) + " с "+ start + " по " + (end-1) + " позицию");
        }*/
        for (int i = 0; i < arrStr.length; i++) {
            str_ = String.valueOf(arrStr[i]);
            Pattern pattern = Pattern.compile("[<p.*]");
            Matcher check_ = pattern.matcher(str_);
            Pattern pattern1 = Pattern.compile("[.*>*]");
            Matcher check_1 = pattern1.matcher(str_);
            if (check_.find()) {
                arrStr[i] = "<p>";
                a++;
                continue;
            }
            else if (check_1.find()) {
                if ("<p>"!= arrStr[i] ) {
                    arrStr[i] = "";
                }
            }

        }
        if (a == 0)
            System.out.println("нет тэгов в тексте");
        else {
            str_ = "";
            for (int i = 0; i < arrStr.length; i++) {
                str_ += arrStr[i] + " ";
            }
            System.out.println(str_);
        }

    }
}
