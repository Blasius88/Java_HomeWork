package Lector18.Erudit;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Adherent extends Thread {
    private Random rand = new Random();
    static Map<Details, Integer> details = new HashMap<>();

    @Override
    public void run() {
        Adherent adherent = new Adherent();
        Dump dump = new Dump();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 4; j++) {
                adherent.get();
            }
            try {
                Adherent.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println(print(details));
    }

    private void get() {
        if (canCollect()) {
            Dump.get(Factory.randomDetail());
        }
    }
    private boolean canCollect() {
        boolean b = false;
        int chance = rand.nextInt(2);
        if (chance == 1) {
            b = true;
        }
        return b;
    }

    private String print(Map<Details, Integer> details){
        int col = Collections.min(details.values());
        return "Роботы собранные ученным: " + col;
    }

}
