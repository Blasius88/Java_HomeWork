package Lector10.Task10_3;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainTask10_3 {
    public static void main(String[] args) {
        List students = new LinkedList();
        students.add("Tom");
        students.add("Bob");
        students.add("Pol");
        students.add("Nelli");
        students.add("Liza");

        for (int i = students.size() - 1; i >= 0; i--)
            System.out.println(students.get(i));

        System.out.println("");
        ListIterator iterator = students.listIterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
        while (iterator.hasPrevious()) {
            System.out.println(iterator.previous());
        }
    }
}
