package Lector7.Enemy;

import Lector7.BattleScenario.AttackEmeny;

public class Vampire extends Enemy {
    public static boolean enemyPick = false;

    @Override
    public void setAttacEnemy(int attacEnemy) {
        super.setAttacEnemy(attacEnemy);
    }

    public void setAttacEnemy(){
        int bool = 1 + (int) (Math.random() * 100);
        if (bool < 50 && bool > 10) {
            AttackEmeny.vampire.damage = (int) (0 + Math.random() * 99);
            System.out.println("Вампир проводит обычную атаку");
            AttackEmeny.vampire.health = 0;
        } else if(bool > 50) {
            AttackEmeny.vampire.damage = 100 + (int) (Math.random() * 99);
            AttackEmeny.vampire.health = AttackEmeny.vampire.damage;
            System.out.println("Вампир высасывает у вас " + AttackEmeny.vampire.damage + "ед. жизни\n" +
                    "и прибовляет ее себе");
        } else if (bool <10){
            System.out.println("Вампир промахнулся");
            AttackEmeny.vampire.damage = 0;
            AttackEmeny.vampire.health = 0;
        }
    }
}
