package Lector7.Hero;


import java.util.Scanner;

public class Mage extends Hero {
    // Выбрали этого героя
    public static boolean heroPick = false;

    public static void attackEnemy ()
    {
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите способ атаки:\n" +
                "1 - обычная атака\n" +
                "2 - супер атака\n");
        int a = sc.nextInt();
        int randDamage = 0;
        switch (a){
            case 1:
                randDamage = (int)(1 + Math.random()*200);
                break;
            case 2:
                randDamage = (int)(200 + Math.random()*1500);
                break;
        }
        Hero.damage = randDamage;
    }
}
