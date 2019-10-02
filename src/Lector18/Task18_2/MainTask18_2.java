package Lector18.Task18_2;

public class MainTask18_2 {
    public static void main(String[] args) {
        FactoryDump dump = new FactoryDump();
        DumpThread tDump = new DumpThread(dump);
        FlunkyThread flunky = new FlunkyThread(dump);
    }
}
