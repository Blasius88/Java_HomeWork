package Lector13.Task1;

import java.util.Scanner;

public class Task13_1 {
    public static void main(String[] args) {
        Long m = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку ");
        String str = sc.nextLine();
        Cycle.task1(str);
        m = System.nanoTime() - m;
        System.out.printf("программа выполнялось %,9.3f ms\n", m/1_000_000.0);
    }
}
