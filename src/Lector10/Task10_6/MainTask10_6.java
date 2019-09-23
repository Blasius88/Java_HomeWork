package Lector10.Task10_6;

import java.util.LinkedList;

public class MainTask10_6 {
    public static void main(String[] args) {
        String text = "Определить множество на основе множества целых чисел. Создать методы на основе для определения пересечения и объединения на основе множеств.";
        System.out.println("Text : " + text);
        String[] textArr = text.split("\\s|\\.\\s|\\.");

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < textArr.length; i++) {
            int k = 0;
            for (int j = 0; j < textArr.length; j++) {
                if (textArr[i].equals(textArr[j])) {
                    k++;
                }
                if (j == textArr.length - 1) {
                    list.add(k + " " + textArr[i]);
                }
            }
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i).equals(list.get(j)) && i != j){
                    list.remove(j);
                }
            }
        }
        System.out.println(list);
    }
}

