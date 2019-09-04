package Lector7.Hero;

import Lector7.Mortal;

import java.util.Scanner;

public class Hero implements Mortal {
    //имя героя
    public String name;

    // сила атаки героя
    public int damage;

    //здоровье героя
    public int health;

    public int HeroAttac;

    String getName() {
        return name;
    }
    void setName(String name) {this.name = name; }

    int getDamage() {
        return damage;
    }
    void setDamage(int damage) {
        this.damage = damage;
    }

    int getHealth() {
        return health;
    }
    void setHealth(int health) {
        this.health = health;
    }

    public int getHeroAttac() {
        return HeroAttac;
    }
    public void setHeroAttac(int heroAttac) {
        HeroAttac = heroAttac;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }
}