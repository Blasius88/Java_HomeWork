package Lector10.Task10_2;

import Lector10.Task10_1.Add;
import Lector10.Task10_1.TaskMain10_1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTask10_2 {
    public static void main(String[] args) {
        ArrayList marks = new ArrayList();
        for (int i = 0; i < 10; i ++){
            marks.add(Add.addMarks());
        }
        TaskMain10_1.print(marks);
        int maxMark = 0;

        Iterator iter = marks.iterator();
        while (iter.hasNext()) {
            int temp =(int) iter.next();
            if (temp > maxMark) {
                maxMark = temp;
            }
        }
        System.out.println("Самыя высокая оценка " + maxMark);
    }
}
