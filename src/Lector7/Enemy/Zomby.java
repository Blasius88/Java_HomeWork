package Lector7.Enemy;

import Lector7.BattleScenario.AttackEmeny;

public class Zomby extends Enemy {
    public static boolean enemyPick = false;

    @Override
    public void setAttacEnemy(int attacEnemy) {
        super.setAttacEnemy(attacEnemy);
    }

    public void setAttacEnemy() {
        int bool = 1 + (int) (Math.random() * 100);
        if (bool <= 50) {
            System.out.println("зомби проводит обычную атаку");
            AttackEmeny.zomby.damage = (int) (0 + Math.random() * 99);
            AttackEmeny.zomby.health = 0;
        }
        else if (bool >50 && bool <90)
        {
            System.out.println("Зомби проводит супер атаку");
            AttackEmeny.zomby.damage = 200 + (int)(Math.random()*1000);
            AttackEmeny.zomby.health = 0;
        }
        else if (bool >90){
            int helpZomby = 50 +(int)(Math.random()*200);
            AttackEmeny.zomby.health = helpZomby;
            System.out.println("Зомби увидел дикого зверя и съел его мозги.\n" +
                    "От свежих мозгов здоровье зомби поправилось на " + helpZomby);
        }
        else if (bool <10){
            System.out.println("Зомби промахнулся");
            AttackEmeny.zomby.damage = 0;
        }
    }
}
