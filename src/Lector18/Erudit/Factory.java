package Lector18.Erudit;

import java.util.Random;

public class Factory extends Thread {
    static int numOfDetail;
    private Random rand = new Random();

    @Override
    public void run() {
        Factory factory = new Factory();
        Dump dump = new Dump();
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
                while (dump.colDetails(dump) < 20) {
                    factory.detailsToTheDump(dump);
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    factory.detailsToTheDump(dump);
                }
            }
            try {
                Factory.sleep(100);
            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    private void detailsToTheDump(Dump dump) {
        if (isTrash()) {
            dump.put(randomDetail());
        }
    }

    private boolean isTrash() {
        boolean b = false;
        int trash = rand.nextInt(2);
        if (trash == 1) {
            b = true;
        }
        return b;
    }

    static Details randomDetail() {
        Details detail = null;
        Random rand = new Random();
        numOfDetail = rand.nextInt(8) + 2;
        switch (numOfDetail) {
            case 1:
                detail = Details.CPU;
                break;
            case 2:
                detail = Details.HDD;
                break;
            case 3:
                detail = Details.HEAD;
                break;
            case 4:
                detail = Details.LEFT_HAND;
                break;
            case 5:
                detail = Details.LEFT_LEG;
                break;
            case 6:
                detail = Details.RAM;
                break;
            case 7:
                detail = Details.RIGHT_HAND;
                break;
            case 8:
                detail = Details.RIGHT_LEG;
            case 9:
                detail = Details.BODY;
        }
        return detail;
    }
}