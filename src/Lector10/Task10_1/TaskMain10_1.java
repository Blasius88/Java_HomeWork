package Lector10.Task10_1;

import Other.ReadFromConsole;
import javafx.print.Collation;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Collection;

public class TaskMain10_1 {
    public static void main(String[] args) {
        Collection<Integer> marks = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i ++)
        {
            marks.add(Add.addMarks());
        }
        print(marks);
        marks.removeIf(x -> x <= 4);
        print(marks);
    }

    public static void print (Collection marks){
        System.out.println(marks);
    }
}
