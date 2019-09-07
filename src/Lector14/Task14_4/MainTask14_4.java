package Lector14.Task14_4;

import Other.ReadFromConsole;

public class MainTask14_4 {
    public static void main(String[] args) {
        System.out.println("Введите строку");
        String text = ReadFromConsole.readFromConsoleStr();
        findPhone(text);
    }

    private static void findPhone(String text) {
        String str = "";
        String str_ ="";
        int a = 0;
        String[] arr = text.split(" ");
        for (int i = 0; i < arr.length; i++) {
            str = String.valueOf(arr[i]);
            boolean check1_ = str.matches("(\\+*)(375*)\\d{9}");
            if (check1_ == true) {
                char[] chars = str.toCharArray();
                for (int j = 0; j < chars.length; j++)
                {
                    if(j == 4)
                        str_ +="(";
                    if (j == 6)
                        str_ += ")";
                        str_ +=chars[j];
                }
                a++;
                System.out.println(str_);
            }
        }
        if (a == 0)
            System.out.println("в тексте не найден номер телефона");

    }
}
