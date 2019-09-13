package Lector12.Task12_5;

import Other.ReadFromConsole;
import jdk.nashorn.internal.runtime.ECMAException;

public class MainTask12_5 {
    public static void main(String[] args) throws MyExceptionTwo {
        try {
            try {
                System.out.println("Бросить одно из существующих в JDK исключений, отловить\n" +
                        " его и выбросить своё собственное, указав\n" +
                        " в качестве причины отловленное.\n" +
                        "Ввендите размер массива");
                int num = ReadFromConsole.readFromConsoleInt();
                errExcep(num);
            } catch (Exception e) {
                throw new MyExceptionTwo("ошибка!!! " + e);
            }
        } catch (MyExceptionTwo e) {
            System.out.println(e.getHiddenException().getMessage());
        }
    }

    public static void errExcep(int num) {
        int[] arrInt = new int[num];
        for (int i = 0; i <= arrInt.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива ");
            arrInt[i] = Other.ReadFromConsole.readFromConsoleInt();
        }

        print(arrInt);
    }

    private static void print(int[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println((i + 1) + " элемент массива = " + arrInt[i]);
        }
    }
}
