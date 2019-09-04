package Lector7;

import Lector7.BattleScenario.AttackEmeny;
import Lector7.Enemy.*;
import Lector7.Hero.*;

import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;

public class BattleGround {
    public static void main(String[] args) {
        int a = classHero();
        switch (a) {
            case 1:
                Warrior warrior = new Warrior();
                warrior.name = NameHero.name();
                ColEmeny.NumberOfEnemy();
                ColEmeny.colEmeny();
                boolean finishFight = false;
                while (!finishFight) {
                    warrior.damage = warrior.setHeroAttac();
                    warrior.health = 1200;
                    finishFight = AttackEmeny.processAttacksEnemy(warrior.damage, warrior.health, warrior.name);
                }
                AttackEmeny.battle(warrior.name);
                break;
            case 2:
                Mage mage = new Mage();
                mage.name = NameHero.name();
                ColEmeny.NumberOfEnemy();
                ColEmeny.colEmeny();
                finishFight = false;
                while (!finishFight) {
                    mage.damage = mage.setHeroAttac();
                    mage.health = 800;
                    finishFight = AttackEmeny.processAttacksEnemy(mage.damage, mage.health, mage.name);
                }
                AttackEmeny.battle(mage.name);
                break;
            case 3:
                Archer archer = new Archer();
                archer.name = NameHero.name();
                ColEmeny.NumberOfEnemy();
                ColEmeny.colEmeny();
                finishFight = false;
                while (!finishFight) {
                    archer.damage = archer.setHeroAttac();
                    archer.health = 1200;
                    finishFight = AttackEmeny.processAttacksEnemy(archer.damage, archer.health, archer.name);
                }
                AttackEmeny.battle(archer.name);
                break;
        }
    }

    //Выбераем класс героя
    public static int classHero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите спецификацию героя:\n" +
                "1 - Воин\n" +
                "2 - Маг\n" +
                "3 - Лучник");
        int a = sc.nextInt();
        return a;
    }


}