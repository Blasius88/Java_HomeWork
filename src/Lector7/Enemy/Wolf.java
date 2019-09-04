package Lector7.Enemy;

import Lector7.BattleScenario.AttackEmeny;

public class Wolf extends Enemy {
    public static boolean enemyPick = false;

    @Override
    public void setAttacEnemy(int attacEnemy) {
        super.setAttacEnemy(attacEnemy);
    }

    public void setAttacEnemyWolf (){
        int bool = 1 + (int) (Math.random()*100);
        if (bool <= 50 && bool > 10) {
            System.out.println("Волк проводит обычную атаку");
            AttackEmeny.wolf.damage = (int) (0 + Math.random() * 99);
        } else if (bool <= 100 && bool > 50){
            System.out.println("Волк проводит супер атаку");
            AttackEmeny.wolf.damage = (int) (100 + Math.random()* 500);
        }
        else if (bool <10){
            System.out.println("Волк промахнулся");
            AttackEmeny.wolf.damage = 0;
        }
    }
}
