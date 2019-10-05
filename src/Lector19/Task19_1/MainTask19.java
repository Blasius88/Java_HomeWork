package Lector19.Task19_1;

public class MainTask19 {
    public static void main(String[] args) {
        Factory dump = new Factory();
        FlunkyThread flunky1 = new FlunkyThread();
        FlunkyThreadTwo flunky2 = new FlunkyThreadTwo();
        dump.start();
        flunky1.start();
        flunky2.start();

    }
}
