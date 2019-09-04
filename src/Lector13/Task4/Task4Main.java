package Lector13.Task4;

import java.util.Scanner;

public class Task4Main {
    public static void main(String[] args) {
        String fio = WorkingClass.recevingData();
        String initials = WorkingClass.getInitials(fio);
        System.out.println(initials);
    }
}
