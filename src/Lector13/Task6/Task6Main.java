package Lector13.Task6;

import Lector13.Task5.ReceivesText;
import Lector13.Task5.WordCount;

public class Task6Main {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        String str = ReceivesText.receivesText();
        WordAbbreviation.wordAbbreviation(str);
    }
}
