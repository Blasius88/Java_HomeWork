package Lector13.Task7;

public class GetIntThree {
    public static String getIntTree (int num){
        Long m = System.nanoTime();
        String str ="";

        m = System.nanoTime() - m;
        System.out.printf("Функция выполнялось %,9.3f ms\n", m / 1_000_000.0);
        return str;
    }
}
