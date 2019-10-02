package Lector18.Task18_2;

import java.util.HashMap;
import java.util.Map;

public class FlunkyThread extends Thread{
    private Map<Detalis, Integer> flunkyDetails = new HashMap<>();
    private Detalis[] robotDetal = Detalis.values();
    public int robot;

    public FlunkyThread(FactoryDump dump) {
        for (int i = 0; i < robotDetal.length; i++) {
            flunkyDetails.put(robotDetal[i], 0);
        }
        run(dump);
        start();
    }

    public void run(FactoryDump dump) {
        int days = 0;
        while (days < 50) {
            try {
                sleep(100);
                dump.getDetails(flunkyDetails);
                createRobor();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            days++;
        }
    }

    void createRobor(){
        if(tryCreate()) {
            for (int i = 0; i < robotDetal.length; i++) {
                flunkyDetails.put(robotDetal[i], (flunkyDetails.get(robotDetal[i]) - 1));
            }
            robot++;
            System.out.println("Робатов собрано: " + robot + "шт");
            createRobor();

        }
    }

    public void infoDetal() {
        for (Map.Entry<Detalis, Integer> o : flunkyDetails.entrySet()) {
            System.out.println(o.getKey() + " " + o.getValue());
        }
    }

    boolean tryCreate() {
        boolean flag = true;
        for (int i = 0; i < robotDetal.length; i++) {
            if (flunkyDetails.get(robotDetal[i]) >=1 ) {
            } else {
                flag = false;
                break;
            }
        }
        return flag;
    }
}