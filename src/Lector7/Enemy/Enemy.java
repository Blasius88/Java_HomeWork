package Lector7.Enemy;

import java.util.ArrayList;
import java.util.List;

public class Enemy {
    //Здоровье
    public static int health;
    int getHealth(){return health;}
    void setHealth (int health){this.health = health; }
    //атака
    public static int damage;
    int getDamage(){return damage; }
    void setDamage(int damage){this.damage = damage; }
    //кол-во врагов
    public static int numberOfEnemy;
    int getNumberOfEnemy(){return numberOfEnemy; }
    void setNumberOfEnemy(int numberOfEnemy) {this.numberOfEnemy=numberOfEnemy; }
    //проверяем кто из врагов активен
    public static boolean zomby = false;

    public static boolean wolf = false;

    public static boolean vampire = false;

    //количество активных персонажей
    public static int zombyCol;
    int getZombyCol(){return zombyCol; }
    void setZombyCol( int zombyCol) {this.zombyCol = zombyCol; }

    public static int wolfCol;
    int getWolfCol(){return wolfCol; }
    void setWolfCol( int wolfCol) {this.wolfCol = wolfCol; }

    public static int vampireCol;
    int getVampireCol(){return vampireCol; }
    void setVampireCol( int vampireCol) {this.vampireCol = vampireCol; }
}
