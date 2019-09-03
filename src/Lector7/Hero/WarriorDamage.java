package Lector7.Hero;

import java.util.Scanner;

public class WarriorDamage {
    public static int attackEnemy()
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
                randDamage = (int)(1 + Math.random()*100);
                break;
            case 2:
                randDamage = (int)(100 + Math.random()*1500);
                break;
        }
        return randDamage;
    }
}
