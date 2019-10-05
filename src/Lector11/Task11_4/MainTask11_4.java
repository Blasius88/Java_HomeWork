package Lector11.Task11_4;

import java.util.*;

public class MainTask11_4 {
    public static void main(String[] args) {
        BlackBox box = new BlackBox();
        box.addToBox(10);
        box.addToBox(10);
        box.addToBox(30);
        box.addToBox(50);
        box.addToBox(50);

        System.out.println(box.getNumbers());

        System.out.println(box.min(2));

        System.out.println(box.max(2));


    }
}