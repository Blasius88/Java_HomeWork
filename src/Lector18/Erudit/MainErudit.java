package Lector18.Erudit;

public class MainErudit {
    public static void main(String[] args) {
        Factory factory =new Factory();
        Dump dump = new Dump();
        Adherent adherent = new Adherent();
        factory.start();
        adherent.start();
    }
}
