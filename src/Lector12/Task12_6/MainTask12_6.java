package Lector12.Task12_6;

import Other.ReadFromConsole;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MainTask12_6 {
    void mainTask12_6(int s) {
        if (s < 0)
            throw new IllegalArgumentException("Ошибка 1 IllegalArgumentException");
    }

    public static void main(String[] args) {
        MainTask12_6 mainTask12_6 = new MainTask12_6();
        System.out.println("Введите положительное число ");
        int s = ReadFromConsole.readFromConsoleInt();
        try {
            mainTask12_6.mainTask12_6(s);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
