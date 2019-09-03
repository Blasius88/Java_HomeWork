package Lector7.Enemy;

public class WolfDamage {
    public static Wolf wolf = new Wolf();
    public static void inci ()
    {
        wolf.health = 800;
    }

    public static void wolfDamage()
    {
        int bool = 1 + (int) (Math.random()*100);
        if (bool <= 50 && bool > 10) {
            System.out.println("Волк проводит обычную атаку");
            wolf.damage = (int) (0 + Math.random() * 99);
        } else if (bool <= 100 && bool > 50){
            System.out.println("Волк проводит супер атаку");
            wolf.damage = (int) (100 + Math.random()* 500);
        }
        else if (bool <10){
            System.out.println("Волк промахнулся");
            wolf.damage = 0;
        }
    }
}
