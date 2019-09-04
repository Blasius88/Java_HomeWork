package Lector7.BattleScenario;


import Lector7.Enemy.*;

import Lector7.Hero.Hero;
import Lector7.Hero.Warrior;
import Lector7.Hero.Archer;
import Lector7.Hero.Mage;
import Lector7.Mortal;

import java.util.Scanner;

public class AttackEmeny {
    // количество врагов
    public static int colEmeny;

    public static boolean oneEnemyDead = false;

    public static boolean win = false;

    public static String[] nameEnemy;
    public static int[] healthEnemy;
    public static int[] damageEnemy;

    public static Zomby zomby = new Zomby();

    public static Vampire vampire = new Vampire();

    public static Wolf wolf = new Wolf();

    public static void atackEnemy() {
        // проверем присвоено ли первому врагу значение
        nameEnemy = new String[colEmeny];
        healthEnemy = new int [colEmeny];
        damageEnemy = new int[colEmeny];
        boolean dataFilling = false;
        //иницилизация врагов
        for (int i = 0; i < colEmeny; i++) {
            if (vampire.enCol != 0 && vampire.enCol > i) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Вампир";
                    healthEnemy[i] = vampire.health;
                    System.out.println("Здоровье вампира " + healthEnemy[i]);
                    dataFilling = true;
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Вампир";
                        healthEnemy[i + 1] = vampire.health;
                        System.out.println("Здоровье вампира " + healthEnemy[i + 1]);
                    } else {
                        nameEnemy[i] = "Вампир";
                        healthEnemy[i] = vampire.health;
                        System.out.println("Здоровье вампира " + healthEnemy[i]);
                    }
                }
            } else if (zomby.enCol != 0) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Зомби";
                    healthEnemy[i] = zomby.health;
                    System.out.println("Здоровье зомби" + healthEnemy[i]);
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Зомби";
                        healthEnemy[i + 1] = zomby.health;
                        System.out.println("Здоровье зомби" + healthEnemy[i + 1]);
                    }
                }
            } else if (wolf.enCol != 0) {
                if (nameEnemy[i] == null) {
                    nameEnemy[i] = "Волк";
                    healthEnemy[i] = wolf.health;
                    System.out.println("Здоровье волка " + healthEnemy[i]);
                    dataFilling = true;
                } else if (nameEnemy[i] != null) {
                    if (i == 0) {
                        nameEnemy[i + 1] = "Волк";
                        healthEnemy[i + 1] = wolf.health;
                        System.out.println("Здоровье волка " + healthEnemy[i + 1]);
                    }
                }
            }
        }
    }

    //Производит атаку
    public static boolean processAttacksEnemy(int damage, int health, String name) {
        boolean finishFight = false;
        //делаем выюор по атаке
        int numberEnemy = 0;
        if (!oneEnemyDead) {
            numberEnemy = enemyChoice();
        }
        //определяем силу атаки героя
        System.out.println("Герой наносит " + damage + "ед. урона");
        //атака на выбранного врага
        if (numberEnemy == 1) {
            healthEnemy[0] -= damage;
            printAndLogic();
            if (healthEnemy[0] <= 0) {
                if (colEmeny >= 2) {
                    int temp = colEmeny;
                    for (int i = 0; i < temp; i++) {
                        nameEnemy[i] = nameEnemy[i + 1];
                        healthEnemy[i] = healthEnemy[i + 1];
                        if (temp >= 2) {
                        temp--;
                        break;
                        }
                    }
                    colEmeny--;
                } else {
                    oneEnemyDead = true;
                }
            }
        } else if (numberEnemy == 2) {
            healthEnemy[1] -= damage;
            printAndLogic();
            if (healthEnemy[1] <= 0) {
                if (colEmeny > 2) {
                    int temp = colEmeny;
                    for (int i = 0; i < temp; i++) {
                        nameEnemy[i] = nameEnemy[i + 1];
                        healthEnemy[i] = healthEnemy[i + 1];
                        if (temp >= 2) {
                            temp--;
                            break;
                        }
                    }
                    colEmeny--;
                } else {
                    oneEnemyDead = true;
                }
            }

        } else if (numberEnemy == 3) {
            healthEnemy[2] -= damage;
            printAndLogic();
            if (healthEnemy[2] <= 0) {
                if (colEmeny > 2) {
                    colEmeny--;
                } else {
                    oneEnemyDead = true;
                }
            }
        } else {
            if (healthEnemy[0] > 0) {
                healthEnemy[0] -= damage;
                printAndLogic();
            } else if (healthEnemy[1] > 0) {
                healthEnemy[1] -= damage;
                printAndLogic();
            } else if (healthEnemy[2] > 0) {
                healthEnemy[2] -= damage;
                printAndLogic();
            }
        }
        //Атака врага по герою
        for (int i = 0; i < colEmeny; i++) {
            if (nameEnemy[i] == "Вампир") {
                if (healthEnemy[i] > 0) {
                    vampire.setAttacEnemy();
                    damageEnemy[i] = vampire.damage;
                    healthEnemy[i] += vampire.health;
                } else {
                    damageEnemy[i] = 0;
                    healthEnemy[i] += 0;
                }

            } else if (nameEnemy[i] == "Зомби") {
                if (healthEnemy[i] > 0) {
                    zomby.setAttacEnemy();
                    damageEnemy[i] = zomby.damage;
                    healthEnemy[i] += zomby.health;
                } else {
                    damageEnemy[i] = 0;
                    healthEnemy[i] += 0;
                }
            } else if (nameEnemy[i] == "Волк") {
                if (healthEnemy[i] > 0) {
                    wolf.setAttacEnemyWolf();
                    damageEnemy[i] = wolf.damage;
                } else {
                    damageEnemy[i] = 0;
                }
            }
        }
        //отнимаем очки здоровья у героя
        for (int i = 0; i < colEmeny; i++) {
            if (healthEnemy[i] > 0) {
                health -= damageEnemy[i];
                System.out.println(nameEnemy[i] + " наносит " + damageEnemy[i] + "ед. урона");
                if (!isAlive(health)) {
                    System.out.println("Здоровья у героя осталось " + health);
                } else if (isAlive(health)) {
                    System.out.println("Герой умер");
                    break;
                }
            }
        }
        for (int i = 0; i < colEmeny; i ++) {
            if (healthEnemy[i] <= 0) {
                finishFight = true;
                win = true;
            } else if (health <= 0) {
                finishFight = true;
            }
        }
        return finishFight;
    }



    public static void battle (String name)
    {
        if(win)
            System.out.println("Герой " + name + " попедил");
        else
            System.out.println("Герой " + name + " проиграл");
    }
    //проверяем умер ли соперник или выводит сообщение о остатке здоровья
    public static void printAndLogic() {
        for (int i = 0; i < colEmeny; i++) {
            if (!isAlive(healthEnemy[i])) {
                System.out.println("Здоровья у " + nameEnemy[i] + " осталось " + healthEnemy[i]);
            } else if (isAlive(healthEnemy[i])) {
                System.out.println("Враг умер");
            }
        }
    }

    //Выбор с кем будет срожаться герой
    public static int enemyChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберете кого будете атковать: ");
        for (int i = 0; i < colEmeny; i++) {
            System.out.println("" + (int) (i + 1) + " - " + nameEnemy[i]);
        }
        int num = sc.nextInt();
        return num;
    }

    public static boolean isAlive (int health)
    {
        boolean death = false;
        if (health <= 0)
            death= true;
        else
            death = false;
        return death;
    }
}

