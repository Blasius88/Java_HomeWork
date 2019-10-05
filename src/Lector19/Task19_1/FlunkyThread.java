package Lector19.Task19_1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FlunkyThread extends Thread {
    private Random rand = new Random();

    private Map<Details, Integer> details;

    FlunkyThread(){
        details = new HashMap<>();
    }

    private void take(Dump dump) {
        if (canTake()) {
            dump.getDetail(Details.randomDetail(), details);
        }
    }

    @Override
    public void run() {
        FlunkyThread scientist = new FlunkyThread();
        Dump dump = new Dump();
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 4; j++) {
                scientist.take(dump);
            }
            try {
                FlunkyThread.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
        System.out.println(robots(scientist.details));
    }

    private boolean canTake() {
        boolean b = false;
        int chance = rand.nextInt(2);
        if (chance == 1) {
            b = true;
        }
        return b;
    }

    private String robots(Map<Details, Integer> details) {
        int number = Collections.min(details.values());
        return "Количество роботов которое 1 ученый может собрать из деталей: " + number;
    }

}