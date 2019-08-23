package Lector7.BattleScenario;

import Lector7.Enemy.Vampire;
import Lector7.Enemy.Wolf;
import Lector7.Enemy.Zomby;

import Lector7.Hero.Archer;
import Lector7.Hero.Hero;
import Lector7.Hero.Mage;
import Lector7.Hero.Warrior;
import Lector7.Mortal;

public class OneEnemy {
    public static void oneEnemy() {
        int healthEnemy = 0;
        int damageEnemy = 0;
        //проверям какой у героя враг
        if (Vampire.enemyPick) {
            Vampire.inci();
            healthEnemy = Vampire.health;
            System.out.println("Здоровье вампира " + healthEnemy);
        } else if (Zomby.enemyPick) {
            Zomby.inci();
            healthEnemy = Zomby.health;
            System.out.println("Здоровье зомби" + healthEnemy);
        } else if (Wolf.enemyPick) {
            Wolf.inci();
            healthEnemy = Wolf.health;
            System.out.println("Здоровье волка" + healthEnemy);
        }
        processAttacksOneEnemy(healthEnemy);
    }

    public static void processAttacksOneEnemy(int healthEnemy) {
        boolean finishFight = false;
        while (!finishFight) {
            // Проверям кто из героев у пользователя
            if (Warrior.heroPick) {
                Warrior.attackEnemy();
            } else if (Mage.heroPick) {
                Mage.attackEnemy();
            } else if (Archer.heroPick) {
                Archer.attackEnemy();
            }
            //определяем силу атаки героя
            int damage = Hero.damage;
            System.out.println("Герой наносит " + damage + "ед. урона");
            healthEnemy -= damage;
            String nameEnemy = "";
            if (Vampire.enemyPick) {
                nameEnemy = "Вампир";
            } else if (Zomby.enemyPick) {
                nameEnemy = "Зомби";
            } else if (Wolf.enemyPick) {
                nameEnemy = "Волк";
            }
            if (!Mortal.isAlive(healthEnemy)) {
                System.out.println("Здоровья у " + nameEnemy + " осталось " + healthEnemy);
            } else if (Mortal.isAlive(healthEnemy)) {
                System.out.println("Враг умер");
                break;
            }

            int damageEnemy = 0;

            if (Vampire.enemyPick) {
                Vampire.vampDamage();
                damageEnemy = Vampire.damage;
                healthEnemy += Vampire.health;
            } else if (Zomby.enemyPick) {
                Zomby.zombDamage();
                damageEnemy = Zomby.damage;
                healthEnemy += Zomby.health;
            } else if (Wolf.enemyPick) {
                Wolf.wolfDamage();
                damageEnemy = Wolf.damage;
            }

            Hero.heath -= damageEnemy;

            System.out.println(nameEnemy + " наносит " + damageEnemy + "ед. урона");
            if (!Mortal.isAlive(Hero.heath)) {
                System.out.println("Здоровья у героя осталось " + Hero.heath);
            } else if (Mortal.isAlive(Hero.heath)) {
                System.out.println("Герой умер");
                break;
            }
        }
    }
}
