package Lector7.Hero;


import java.util.Scanner;

public class Mage extends Hero {

    @Override
    public void setHeroAttac(int heroAttac) {
        super.setHeroAttac(heroAttac);
    }

    public int setHeroAttac() {
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
                randDamage = (int)(100 + Math.random()*2000);
                break;
        }
        return randDamage;
    }
}
