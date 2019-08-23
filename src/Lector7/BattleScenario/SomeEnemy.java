package Lector7.BattleScenario;


import Lector7.Enemy.Enemy;
import Lector7.Enemy.Vampire;
import Lector7.Enemy.Zomby;
import Lector7.Enemy.Wolf;

import Lector7.Hero.Hero;
import Lector7.Hero.Warrior;
import Lector7.Hero.Archer;
import Lector7.Hero.Mage;
import Lector7.Mortal;

import java.util.Scanner;

public class SomeEnemy {
    // количество врагов
    public static int a = 0;

    public static String[] nameEnemy = new String[3];
    public static int[] healthEnemy = new int[3];
    public static int[] damageEnemy = new int[3];

    public static void twoEnemy() {
        // проверем присвоено ли первому врагу значение
        boolean dataFilling = false;
        //иницилизация врагов
        for (int i = 0; i < a; i++) {
            if (Vampire.vampireCol != 0 && Vampire.vampireCol > i) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Вампир";
                    Vampire.inci();
                    healthEnemy[i] = Vampire.health;
                    System.out.println("Здоровье вампира " + healthEnemy[i]);
                    dataFilling = true;
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Вампир";
                        Vampire.inci();
                        healthEnemy[i + 1] = Vampire.health;
                        System.out.println("Здоровье вампира " + healthEnemy[i + 1]);
                    } else {
                        nameEnemy[i] = "Вампир";
                        Vampire.inci();
                        healthEnemy[i] = Vampire.health;
                        System.out.println("Здоровье вампира " + healthEnemy[i]);
                    }
                }
            } else if (Zomby.zombyCol != 0) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Зомби";
                    Zomby.inci();
                    healthEnemy[i] = Zomby.health;
                    System.out.println("Здоровье зомби" + healthEnemy[i]);
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Зомби";
                        Zomby.inci();
                        healthEnemy[i + 1] = Zomby.health;
                        System.out.println("Здоровье зомби" + healthEnemy[i + 1]);
                    }
                }
            } else if (Wolf.wolfCol != 0) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Волк";
                    Wolf.inci();
                    healthEnemy[i] = Wolf.health;
                    System.out.println("Здоровье волка " + healthEnemy[i]);
                    dataFilling = true;
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Волк";
                        Wolf.inci();
                        healthEnemy[i + 1] = Wolf.health;
                        System.out.println("Здоровье волка " + healthEnemy[i + 1]);
                    }
                }
            }
        }
        processAttacksTwoEnemy();
    }

    //Производит атаку
    public static void processAttacksTwoEnemy() {
        boolean finishFight = false;
        boolean oneEnemyDead = false;
        while (!finishFight) {
            //делаем выюор по атаке
            int numberEnemy = 0;
            if (!oneEnemyDead) {
                numberEnemy = enemyChoice();
            }
            // Проверям кто из героев у пользователя и считываем показания героя по атаке
            if (Warrior.heroPick) {
                Warrior.attackEnemy();
            } else if (Mage.heroPick) {
                Mage.attackEnemy();
            } else if (Archer.heroPick) {
                Archer.attackEnemy();
            }
            //определяем силу атаки героя
            System.out.println("Герой наносит " + Hero.damage + "ед. урона");
            //атака на выбранного врага
            if (numberEnemy == 1) {
                healthEnemy[0] -= Hero.damage;
                printAndLogic();
                if (healthEnemy[0] <= 0) {
                    if (a > 2) {
                        for (int i = 0; i < a; i++) {
                            nameEnemy[i] = nameEnemy[i + 1];
                            healthEnemy[i] = healthEnemy[i + 1];
                            if (a > 2) {
                                break;
                            }
                        }
                        a--;
                    } else {
                        oneEnemyDead = true;
                    }
                }
            } else if (numberEnemy == 2) {
                healthEnemy[1] -= Hero.damage;
                printAndLogic();
                if (healthEnemy[1] <= 0) {
                    if (a > 2) {
                        for (int i = 1; i < a; i++) {
                            nameEnemy[i] = nameEnemy[i + 1];
                            healthEnemy[i] = healthEnemy[i + 1];
                        }
                        a--;
                    } else {
                        oneEnemyDead = true;
                    }
                }
            } else if (numberEnemy == 3) {
                healthEnemy[2] -= Hero.damage;
                printAndLogic();
                if (healthEnemy[2] <= 0) {
                    if (a > 2) {
                        a--;
                    } else {
                        oneEnemyDead = true;
                    }
                }
            } else {
                if (healthEnemy[0] > 0) {
                    healthEnemy[0] -= Hero.damage;
                    printAndLogic();
                } else if (healthEnemy[1] > 0) {
                    healthEnemy[1] -= Hero.damage;
                    printAndLogic();
                } else if (healthEnemy[2] > 0) {
                    healthEnemy[2] -= Hero.damage;
                    printAndLogic();
                }
            }
            //Атака врага по герою
            for (int i = 0; i < a; i++) {
                if (nameEnemy[i] == "Вампир") {
                    if (healthEnemy[i] > 0) {
                        Vampire.vampDamage();
                        damageEnemy[i] = Vampire.damage;
                        healthEnemy[i] += Vampire.health;
                    } else {
                        damageEnemy[i] = 0;
                        healthEnemy[i] += 0;
                    }

                } else if (nameEnemy[i] == "Зомби") {
                    if (healthEnemy[i] > 0) {
                        Zomby.zombDamage();
                        damageEnemy[i] = Zomby.damage;
                        healthEnemy[i] += Zomby.health;
                    } else {
                        damageEnemy[i] = 0;
                        healthEnemy[i] += 0;
                    }
                } else if (nameEnemy[i] == "Волк") {
                    if (healthEnemy[i] > 0) {
                        Wolf.wolfDamage();
                        damageEnemy[i] = Wolf.damage;
                    } else {
                        damageEnemy[i] = 0;
                    }
                }
            }
            //отнимаем очки здоровья у героя
            for (int i = 0; i < a; i++) {
                if (healthEnemy[i] > 0) {
                    Hero.heath -= damageEnemy[i];
                    System.out.println(nameEnemy[i] + " наносит " + damageEnemy[i] + "ед. урона");
                    if (!Mortal.isAlive(Hero.heath)) {
                        System.out.println("Здоровья у героя осталось " + Hero.heath);
                    } else if (Mortal.isAlive(Hero.heath)) {
                        System.out.println("Герой умер");
                        break;
                    }
                }
            }
            if (healthEnemy[0] <= 0 && healthEnemy[1] <= 0 && healthEnemy[2] <= 0) {
                finishFight = true;
                System.out.println("Герой " + Hero.name + " попедил");
            } else if (Hero.heath <= 0) {
                finishFight = true;
                System.out.println("Герой " + Hero.name + " проиграл");
            }
        }
    }

    //проверяем умер ли соперник или выводит сообщение о остатке здоровья
    public static void printAndLogic() {
        for (int i = 0; i < a; i++) {
            if (!Mortal.isAlive(healthEnemy[i])) {
                System.out.println("Здоровья у " + nameEnemy[i] + " осталось " + healthEnemy[i]);
            } else if (Mortal.isAlive(healthEnemy[i])) {
                System.out.println("Враг умер");
            }
        }
    }

    //Выбор с кем будет срожаться герой
    public static int enemyChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете кого будете атковать: ");
        for (int i = 0; i < a; i++) {
            System.out.println("" + (int) (i + 1) + " - " + nameEnemy[i]);
        }
        int num = sc.nextInt();
        return num;
    }
}

