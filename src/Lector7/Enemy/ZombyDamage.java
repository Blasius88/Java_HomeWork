package Lector7.Enemy;

public class ZombyDamage {
    public static Zomby zomby = new Zomby();
    public static void inci ()
    {
        zomby.health = 900;
    }

    public static void zombDamage() {
        int bool = 1 + (int) (Math.random() * 100);
        if (bool <= 50) {
            System.out.println("зомби проводит обычную атаку");
            zomby.damage = (int) (0 + Math.random() * 99);
            zomby.health = 0;
        }
        else if (bool >50 && bool <90)
        {
            System.out.println("Зомби проводит супер атаку");
            zomby.damage = 200 + (int)(Math.random()*1000);
            zomby.health = 0;
        }
        else if (bool >90){
            int helpZomby = 50 +(int)(Math.random()*200);
            zomby.health = helpZomby;
            System.out.println("Зомби увидел дикого зверя и съел его мозги.\n" +
                    "От свежих мозгов здоровье зомби поправилось на " + helpZomby);
        }
        else if (bool <10){
            System.out.println("Зомби промахнулся");
            zomby.damage = 0;
        }
    }
}
