package Lector7.Enemy;

public class Vampire extends Enemy {
    public static boolean enemyPick = false;
    @Override
    void setHealth(int health) {
        super.setHealth(health);
    }
    @Override
    void setDamage(int damage) {
        super.setDamage(damage);
    }

    public static void inci (){
        Vampire.health = 1000;
    }

    public static void vampDamage() {
        int bool = 1 + (int) (Math.random() * 100);
        if (bool < 50 && bool > 10) {
            Vampire.damage = (int) (0 + Math.random() * 99);
            System.out.println("Вампир проводит обычную атаку");
            Vampire.health = 0;
        } else if(bool > 50) {
            Vampire.damage = 100 + (int) (Math.random() * 99);
            Vampire.health = Vampire.damage;
            System.out.println("Вампир высасывает у вас " + Vampire.damage + "ед. жизни\n" +
                    "и прибовляет ее себе");
        } else if (bool <10){
            System.out.println("Вампир промахнулся");
            damage = 0;
            Vampire.health = 0;
        }
    }
}
