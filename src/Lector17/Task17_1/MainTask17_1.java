package Lector17.Task17_1;

import java.util.ArrayList;
import java.util.OptionalDouble;
import java.util.Random;

public class MainTask17_1 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> arr = new ArrayList();
        for (int i = 0; i < 50; i++) {
            arr.add(random.nextInt(100));
        }
        for (int i : arr
        ) {
            System.out.printf(" " + i);
        }
        OptionalDouble rez = arr.stream().filter(elemMas -> elemMas % 2 != 0 && elemMas % 5 == 0).mapToInt(elemMas -> elemMas).average();
        System.out.println("\nсреднее число всех не четных чисел: " + rez);
    }
}