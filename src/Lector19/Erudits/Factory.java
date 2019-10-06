package Lector19.Erudits;

import java.util.Random;

public class Factory extends Thread {
    static int numOfDetail;
    private Random rand = new Random();
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

    @Override
    public void run() {
        Factory factory = new Factory();
        Dump dump = new Dump();
        for (int i = 0; i < 100; i++) {
            if (i == 1) {
                while (dump.amountOfDetails(dump) < 20) {
                    factory.detailsToTheDump(dump);
                }
            } else {
                for (int j = 0; j < 4; j++) {
                    factory.detailsToTheDump(dump);
                }
            }
            try {
                Factory.sleep(100);
            } catch (InterruptedException ie) {
                System.out.println(ie);
            }
        }
    }

    static Details randomDetail() {
        Details detail = null;
        Random rand = new Random();
        numOfDetail = rand.nextInt(9) + 1;
        switch (numOfDetail) {
            case 1:
                detail = Details.CPU;
                break;
            case 2:
                detail = Details.HDD;
                break;
            case 3:
                detail = Details.Had;
                break;
            case 4:
                detail = Details.Left_Hand;
                break;
            case 5:
                detail = Details.Left_Leg;
                break;
            case 6:
                detail = Details.RAM;
                break;
            case 7:
                detail = Details.Right_Hand;
                break;
            case 8:
                detail = Details.Right_Leg;
            case 9:
                detail = Details.Body;
        }
        return detail;
    }
}