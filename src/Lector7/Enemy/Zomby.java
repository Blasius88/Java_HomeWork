package Lector7.Enemy;

public class Zomby extends Enemy {
    public static boolean enemyPick = false;
    @Override
    void setHealth(int health) {
        super.setHealth(health);
        health =700;
    }

    @Override
    void setDamage(int damage) {
        super.setDamage(damage);
    }

    @Override
    void setEnCol(int enCol) {
        super.setEnCol(enCol);
    }
}
