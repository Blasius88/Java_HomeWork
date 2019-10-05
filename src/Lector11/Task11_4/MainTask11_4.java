package Lector11.Task11_4;

import java.util.*;

public class MainTask11_4 {
    public static void main(String[] args) {
        BlackBox box = new BlackBox();

        box.addToBox(1);
        box.addToBox(2);
        box.addToBox(10);
        box.addToBox(20);
        box.addToBox(20);

        System.out.println(box.getNumbers());

        System.out.println(box.min(2));

        System.out.println(box.max(2));
    }
}