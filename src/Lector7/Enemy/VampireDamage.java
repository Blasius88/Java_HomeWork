package Lector7.Enemy;

public class VampireDamage {
    public static Vampire vampire = new Vampire();
    public static void inci (){
        vampire.health = 1000;
    }

    public static void vampDamage() {
        int bool = 1 + (int) (Math.random() * 100);
        if (bool < 50 && bool > 10) {
            vampire.damage = (int) (0 + Math.random() * 99);
            System.out.println("Вампир проводит обычную атаку");
            vampire.health = 0;
        } else if(bool > 50) {
            vampire.damage = 100 + (int) (Math.random() * 99);
            vampire.health = vampire.damage;
            System.out.println("Вампир высасывает у вас " + vampire.damage + "ед. жизни\n" +
                    "и прибовляет ее себе");
        } else if (bool <10){
            System.out.println("Вампир промахнулся");
            vampire.damage = 0;
            vampire.health = 0;
        }
    }
}
