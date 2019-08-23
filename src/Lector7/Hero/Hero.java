package Lector7.Hero;

import java.util.Scanner;

public class Hero {
    //имя героя
    public static String name;

    String getName() {
        return name;
    }

    //классификация героя
    public static int classification;

    int getClassification() {
        return classification;
    }

    void setClassification(int classification) {
        this.classification = classification;
    }

    // сила атаки героя
    public static int damage;

    int getDamage() {
        return damage;
    }

    void setDamage(int damage) {
        this.damage = damage;
    }

    //здоровье героя
    public static int heath;

    int getHeath() {
        return heath;
    }

    void setHeath(int heath) {
        this.heath = heath;
    }

    //Выбераем имя героя
    public static void name() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя героя: ");
        String name = sc.nextLine();
        Hero.name = name;
    }

    //Выбераем класс героя
    public static void classHero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите спецификацию героя:\n" +
                "1 - Воин\n" +
                "2 - Маг\n" +
                "3 - Лучник");
        Hero.classification = sc.nextInt();
    }
}