package Lector13.Task5;

public class Task5Main {
    public static void main(String[] args) {
        System.out.println("Введите текст");
        String text = ReceivesText.receivesText();
        WordCount.wordCount(text);
    }
}
