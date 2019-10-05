package Lector19.Score;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class Score {
    public void score() {

        ArrayList<Good> prod = new ArrayList<Good>();
        prod.add(new Good(0, "Beer", 1.42, rand()));
        prod.add(new Good(1, "Vodka", 5.6, rand()));
        prod.add(new Good(2, "Chips", 0.79, rand()));
        prod.add(new Good(3, "bread", 0.5, rand()));
        prod.add(new Good(4, "Milk", 0.7, rand()));
        prod.add(new Good(5, "Herring", 1.79, rand()));
        prod.add(new Good(6, "kefir", 0.63, rand()));
        prod.add(new Good(7, "loaf", 0.5, rand()));
        prod.add(new Good(8, "buckwheat", 0.6, rand()));

        for (int i = 0; i < prod.size(); i++) {
            System.out.println( prod.get(i));
        }
    }

    double rand() {
        Random random = new Random();
        double x = 0 + (Math.random() + 0.89);
        return x;
    }
}
