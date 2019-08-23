package Lector7;

import Lector7.BattleScenario.SomeEnemy;
import Lector7.Enemy.Enemy;
import Lector7.Enemy.Vampire;
import Lector7.Enemy.Wolf;
import Lector7.Enemy.Zomby;
import Lector7.Hero.Archer;
import Lector7.Hero.Hero;
import Lector7.Hero.Mage;
import Lector7.Hero.Warrior;

public class BattleGround {
    public static void main(String[] args) {
        Hero.name();
        Hero.classHero();
        int a = Hero.classification;
        switch (a) {
            case 1:
                Warrior.heroPick = true;
                Hero.heath = 1200;
                NumberOfEnemy();
                GameProcess.takeDamage();
                break;
            case 2:
                Mage.heroPick = true;
                Hero.heath = 800;
                NumberOfEnemy();
                GameProcess.takeDamage();
                break;
            case 3:
                Archer.heroPick = true;
                Hero.heath = 1000;
                NumberOfEnemy();
                GameProcess.takeDamage();
                break;
        }
    }
    //Количество врагов наподают на героя
    public static void NumberOfEnemy() {
        Enemy.numberOfEnemy = (int) (1 + Math.random() *3);
        int col = 0;
        if (Enemy.numberOfEnemy == 1) {
            col = 1;
            choiceOfSteps(col);
        } else if (Enemy.numberOfEnemy == 2) {
            col = 2;
            choiceOfSteps(col);
        } else if (Enemy.numberOfEnemy == 3) {
            col = 3;
            choiceOfSteps(col);
        }
        SomeEnemy.a = col;
    }

    //кто именно наподает на героя
    public static void choiceOfSteps(int col) {
        Enemy.zombyCol = 0;
        Enemy.vampireCol = 0;
        Enemy.wolfCol = 0;
        int a = 0;
        for (int i = 1; i <= col; i++) {
            a = (int) (1 + Math.random()*2);
            if (a == 1) {
                Enemy.vampire = true;
                Vampire.enemyPick = true;
                Enemy.vampireCol++;
            } else if (a == 2) {
                Enemy.wolf = true;
                Wolf.enemyPick = true;
                Enemy.wolfCol++;
            } else if (a == 3) {
                Enemy.zomby = true;
                Zomby.enemyPick = true;
                Enemy.zombyCol++;
            }
        }
    }
}