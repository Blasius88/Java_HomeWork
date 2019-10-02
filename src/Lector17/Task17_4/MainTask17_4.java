package Lector17.Task17_4;

import java.util.ArrayList;

public class MainTask17_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        StringBuffer str = new StringBuffer();

        arrlist.forEach(value -> str.append(value.toString()));
        System.out.println(str.toString());
    }
}
