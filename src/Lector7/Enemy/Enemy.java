package Lector7.Enemy;

import Lector7.Mortal;

import java.util.ArrayList;
import java.util.List;

public class Enemy implements Mortal {
    //Здоровье
    public int health;

    //атака
    public int damage;

    //Выбор атаки врага
    public int attacEnemy;

    //кол-во врагов
    public int numberOfEnemy;

    //количество активных персонажей
    public int enCol;

    //проверяем кто из врагов активен
    public static boolean zomby = false;

    public static boolean wolf = false;

    public static boolean vampire = false;



    int getHealth(){return health;}
    void setHealth (int health){this.health = health; }

    int getDamage(){return damage; }
    void setDamage(int damage){this.damage = damage; }

    public int getAttacEnemy() {
        return attacEnemy;
    }
    public void setAttacEnemy(int attacEnemy) {
        this.attacEnemy = attacEnemy;
    }

    int getNumberOfEnemy(){return numberOfEnemy; }
    void setNumberOfEnemy(int numberOfEnemy) {this.numberOfEnemy=numberOfEnemy; }

    int getEnCol(){return enCol; }
    void setEnCol(int enCol) {this.enCol = enCol; }

    @Override
    public boolean isAlive() {
        return health >0 ;
    }
}
