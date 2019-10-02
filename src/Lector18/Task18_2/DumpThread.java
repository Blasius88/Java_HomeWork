package Lector18.Task18_2;

import java.util.Random;

public class DumpThread extends Thread {
    private FactoryDump dump;
    private Detalis[] robotDetalisList = Detalis.values();

    public DumpThread(FactoryDump dump) {
        this.dump = dump;
        dump.detailUtill();
        start();
    }

    public void run() {
        Random random = new Random();
        int days = 0;

        while (days < 50) {
            try {
                sleep(100);
                int randomDetail;
                int value;
                int z = random.nextInt(4);
                for (int i = 0; i < z; i++) {
                    randomDetail = random.nextInt(robotDetalisList.length);
                    dump.putDeatails(robotDetalisList[randomDetail]);
                }
                days++;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    FactoryDump getDump() {
        return dump;
    }
}