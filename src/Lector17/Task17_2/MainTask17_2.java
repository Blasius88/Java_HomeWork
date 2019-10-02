package Lector17.Task17_2;

import java.util.ArrayList;

public class MainTask17_2 {
    public static void main(String[] args) {
        ArrayList <String> arr = new ArrayList<>();
        arr.add("1");
        arr.add("12");
        arr.add("123");
        arr.add("12345678");
        arr.add("123456789");
        arr.add("abcdefgh");
        arr.add("123456789");
        arr.add("12345678g");
        long rez = arr.stream().filter(elemMas->elemMas.length() > 8).distinct().count();
        System.out.println("Кол-во строк: " + rez);
    }
}
