package Lector11.Task11_1;

import Other.ReadFromConsole;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainTask11_1 {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        System.out.println("Введите размер массива");
        int arrCol = ReadFromConsole.readFromConsoleInt();
        for (int i = 0; i < arrCol; i++) {
            System.out.printf("Введите %d элемент массива ", (i+1));
            arr.add(ReadFromConsole.readFromConsoleInt());

        }
        System.out.println(arr +"\n" +
                "Кол-во уникальных жлементов " + countUnique(arr));
    }

    private static int countUnique(ArrayList list) {
        if (list.size() == 0) {
            return 0;
        } else {
            Set set = new LinkedHashSet(list);
            return set.size();
        }
    }
}