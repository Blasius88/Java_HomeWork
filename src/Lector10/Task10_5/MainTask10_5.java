package Lector10.Task10_5;

import java.util.ArrayList;
import java.util.Collection;

public class MainTask10_5 {
    public static void main(String[] args) {
        Collection list1 = new ArrayList();
        Collection list2 = new ArrayList();
        for (int i = 0; i < 6 ; i ++)
        list1.add((i + 1));
       for (int i = 4; i < 10; i ++)
        list2.add((i+1));

        Object allRes = combo(list1, list2);

        System.out.println(allRes);

        list1.retainAll(list2);
        System.out.println(list1);

    }

    static Object combo(Object a, Object b) {
        ArrayList allRes = new ArrayList();
        allRes.addAll((Collection) a);
        allRes.addAll((Collection) b);
        return allRes;
    }
}