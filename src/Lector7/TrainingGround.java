package Lector7;

import Lector7.Hero.Archer;
import Lector7.Hero.Hero;
import Lector7.Hero.Mage;
import Lector7.Hero.Warrior;

public class TrainingGround
{
    public static void main(String[] args)
    {
        Hero.name();
        Hero.classHero();
        int a = Hero.classification;
        switch (a) {
            case 1:
                Warrior.attackEnemy();
                break;
            case 2:
                Mage.attackEnemy();
                break;
            case 3:
                Archer.attackEnemy();
                break;
        }
    }
}
