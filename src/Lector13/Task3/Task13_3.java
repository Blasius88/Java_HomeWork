package Lector13.Task3;

import javax.jws.soap.SOAPMessageHandlers;
import java.util.Scanner;

public class Task13_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввелите строку");
        String str = sc.nextLine();
        System.out.println("Введите слово");
        String word = sc.nextLine();
        boolean check = Check.check(str, word);
        if (!check){
            System.out.println("строка начинается и заканчивается не одинаково");
        }
        else
        {
            System.out.println("строка начинается и заканчивается одинаково");
        }
    }
}
