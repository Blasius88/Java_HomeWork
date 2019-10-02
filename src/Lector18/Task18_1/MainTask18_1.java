package Lector18.Task18_1;

public class MainTask18_1 extends Thread {
    private static long sum = 0;
    private static Thread sumThread;
    public static void main(String[] args) {
        sumThread = new MainTask18_1();
        sumThread.start();
    }

    public void run() {
        Demon demon = new Demon();
        for (int i = 0; i < 10_000_000; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
            if (i == 1_000_000) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            demon.setValue(sum);
        }
    }
}

class Demon extends Thread{
    private long value;
    void setValue(long value)
    {
        this.value = value;
    }
    Demon(){
        setDaemon(true);
        start();
    }

    public void run(){
        while (true)
        {
            try {
                sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(value);
        }
    }
}
