package Lector13.Task4;

import java.util.Scanner;

public class WorkingClass {
    public static String recevingData()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите фамилию, имя  и отчество");
        String family = sc.nextLine();
        return  family;
    }

    public static String getInitials(String str) {
        String[] tempArray = str.split(" +");
        String rezult = tempArray[0] + " ";
        for (int i = 1; i < tempArray.length; i++) {
            rezult += tempArray[i].substring(0, 1).toUpperCase() + ". ";
        }
        return rezult.trim();
    }
}
