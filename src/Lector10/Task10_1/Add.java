package Lector10.Task10_1;

import javafx.scene.control.RadioMenuItem;

import java.util.ArrayList;
import java.util.Random;

public class Add {
    public static int addMarks(){
        Random random = new Random();
        int mark = random.nextInt(10) + 1;
        return mark;
    }
}
