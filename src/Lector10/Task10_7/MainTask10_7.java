package Lector10.Task10_7;

import Other.ReadFromConsole;

import java.util.Iterator;
import java.util.LinkedList;

public class MainTask10_7 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        System.out.println("Введите количество элементов");
        int col = ReadFromConsole.readFromConsoleInt();
        for (int i = 0; i < col; i++) {
            System.out.printf("Введите число ");
            linkedList.add(ReadFromConsole.readFromConsoleInt());
        }
        Iterator iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        for (int i = 0; i < linkedList.size(); i++) {
            if ((int) linkedList.get(i) < 0) {
                linkedList.addLast(linkedList.get(i));
                linkedList.remove(i);
            }
        }

        System.out.println("\n");

        for (Object value : linkedList) {
            System.out.print(value + " ");

        }
    }
}