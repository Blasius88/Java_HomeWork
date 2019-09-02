package Lector13.Task2;

import java.util.Scanner;

public class Task13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите смайлики");
        String str = sc.nextLine();
        Replac.replac(str);
    }
}
