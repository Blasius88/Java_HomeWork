package Lector7.Hero;

import java.util.Scanner;

public class NameHero {
    //Выбераем имя героя
    public static String name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя героя: ");
        String name_ = sc.nextLine();
        return name_;
    }
}
