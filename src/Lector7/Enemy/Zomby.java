package Lector7.Enemy;

public class Zomby extends Enemy {
    public static boolean enemyPick = false;
    @Override
    void setHealth(int health) {
        super.setHealth(health);
        health =700;
    }

    @Override
    void setDamage(int damage) {
        super.setDamage(damage);
    }

    public static void inci ()
    {
        Zomby.health = 900;
    }

    public static void zombDamage() {
        int bool = 1 + (int) (Math.random() * 100);
        if (bool <= 50) {
            System.out.println("зомби проводит обычную атаку");
            Zomby.damage = (int) (0 + Math.random() * 99);
            Zomby.health = 0;
        }
        else if (bool >50 && bool <90)
        {
            System.out.println("Зомби проводит супер атаку");
            Zomby.damage = 200 + (int)(Math.random()*1000);
            Zomby.health = 0;
        }
        else if (bool >90){
            int helpZomby = 50 +(int)(Math.random()*200);
            Zomby.health = helpZomby;
            System.out.println("Зомби увидел дикого зверя и съел его мозги.\n" +
                    "От свежих мозгов здоровье зомби поправилось на " + helpZomby);
        }
        else if (bool <10){
            System.out.println("Зомби промахнулся");
            damage = 0;
        }
    }
}
