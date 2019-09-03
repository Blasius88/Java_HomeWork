package Lector7.Enemy;

import Lector7.BattleScenario.AttackEmeny;

public class ColEmeny {
    public static Enemy enemy = new Enemy();
    //takeDamage вывести в интерфейс
    public static void colEmeny() {
        //нужно для того что бы посчитать сколько видов врагов напали
        int a = 0;
        String attackingEnemies = "";
        if (WolfDamage.wolf.enCol != 0) {
            a++;
            attackingEnemies += "Волк в кол " + WolfDamage.wolf.enCol + "шт. ";
        }
        if (VampireDamage.vampire.enCol != 0) {
            a++;
            attackingEnemies += "Вампир в кол " + VampireDamage.vampire.enCol + "шт. ";
        }
        if (ZombyDamage.zomby.enCol != 0) {
            a++;
            attackingEnemies += "Зомби в кол " + ZombyDamage.zomby.enCol + "шт. ";
        }
        if (a == 1 && WolfDamage.wolf.enCol > 1 || a == 1 && ZombyDamage.zomby.enCol > 1 || a == 1 && VampireDamage.vampire.enCol > 1 || a > 1)
            System.out.println("На вашего героя напали " + attackingEnemies);
        else
            System.out.println("На вашего героя напал " + attackingEnemies);
        AttackEmeny.atackEnemy();
    }

    //Количество врагов наподают на героя
    public static void NumberOfEnemy() {

        enemy.numberOfEnemy = (int) (1 + Math.random() *3);
        int col = 0;
        if (enemy.numberOfEnemy == 1) {
            col = 1;
            choiceOfSteps(col);
        } else if (enemy.numberOfEnemy == 2) {
            col = 2;
            choiceOfSteps(col);
        } else if (enemy.numberOfEnemy == 3) {
            col = 3;
            choiceOfSteps(col);
        }
        AttackEmeny.colEmeny = col;
    }

    //кто именно наподает на героя
    public static void choiceOfSteps(int col) {
        ZombyDamage.zomby.enCol = 0;
        VampireDamage.vampire.enCol = 0;
        WolfDamage.wolf.enCol = 0;
        int a = 0;
        for (int i = 1; i <= col; i++) {
            a = (int) (1 + Math.random()*2);
            if (a == 1) {
                enemy.vampire = true;
                Vampire.enemyPick = true;
                VampireDamage.vampire.enCol++;
            } else if (a == 2) {
                enemy.wolf = true;
                Wolf.enemyPick = true;
                WolfDamage.wolf.enCol++;
            } else if (a == 3) {
                enemy.zomby = true;
                Zomby.enemyPick = true;
                ZombyDamage.zomby.enCol++;
            }
        }
    }
}
