package Lector13.Task7;

import java.util.Scanner;

public class MainTask7 {
    public static void main(String[] args) {
        System.out.println("Введете число");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String str = GetInt.getInt(num);
        print(str);
        str = GetIntTwo.getIntTwo(num);
        print(str);
        str = GetIntThree.getIntTree(num);
        print(str);
        System.out.println(str);
    }

    public static void print(String str) {
        System.out.println("Контрольное значение " + str);
    }
}
