package Lector7;

import Lector7.BattleScenario.OneEnemy;
import Lector7.BattleScenario.SomeEnemy;
import Lector7.Enemy.Enemy;

public interface GameProcess {

    //takeDamage вывести в интерфейс
    public static void colEmeny ()
    {
        //нужно для того что бы посчитать сколько видов врагов напали
        int a = 0;
        String attackingEnemies ="";
        if (Enemy.wolfCol != 0)
        {
            a ++;
            attackingEnemies += "Волк в кол "+ Enemy.wolfCol + "шт. ";
        }
        if (Enemy.vampireCol != 0)
        {
            a++;
            attackingEnemies += "Вампир в кол "+ Enemy.vampireCol + "шт. ";
        }
        if (Enemy.zombyCol != 0)
        {
            a++;
            attackingEnemies += "Зомби в кол "+ Enemy.zombyCol + "шт. ";
        }
        if (a == 1 && Enemy.wolfCol > 1 || a == 1 && Enemy.zombyCol > 1  || a == 1 && Enemy.vampireCol > 1 || a > 1)
            System.out.println("На вашего героя напали " + attackingEnemies);
        else
            System.out.println("На вашего героя напал "+attackingEnemies);

        if (Enemy.numberOfEnemy == 1 )
        {
            OneEnemy.oneEnemy();
        }
        else if (Enemy.numberOfEnemy == 2 )
        {
            SomeEnemy.twoEnemy();
        }
        else if (Enemy.numberOfEnemy == 3)
        {
            SomeEnemy.twoEnemy();
        }
    }
}
