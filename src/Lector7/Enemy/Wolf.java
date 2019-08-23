package Lector7.Enemy;

public class Wolf extends Enemy {
    public static boolean enemyPick = false;
    @Override
    void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    void setDamage(int damage) {
        super.setDamage(damage);
    }

    public static void inci ()
    {
        Wolf.health = 800;
    }

    public static void wolfDamage()
    {
        int bool = 1 + (int) (Math.random()*100);
        if (bool <= 50 && bool > 10) {
            System.out.println("Волк проводит обычную атаку");
            Wolf.damage = (int) (0 + Math.random() * 99);
        } else if (bool <= 100 && bool > 50){
            System.out.println("Волк проводит супер атаку");
            Wolf.damage = (int) (100 + Math.random()* 500);
        }
        else if (bool <10){
            System.out.println("Волк промахнулся");
            Wolf.damage = 0;
        }
    }
}
