package Lector7;

public interface Mortal {
    public static boolean isAlive(int health)
    {
        boolean death = false;
        if (health <= 0)
            death= true;
        else
            death = false;
        return death;
    }
}
