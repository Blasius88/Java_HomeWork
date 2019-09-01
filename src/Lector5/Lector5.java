package Lector5;

import java.util.Scanner;

public class Lector5 {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1 число");
        int a = sc.nextInt();
        System.out.println("Введите 2 число");
        int b = sc.nextInt();
        int sum = Task.task(a, b);
        System.out.println("Введите 1 слово");
        String one = sc.next();
        System.out.println("Введите 2 слово");
        String two = sc.next();
        String str = Task.task(one, two);
        System.out.println("Sum = " + sum);
        System.out.println("Str =" + str);
    }
}
