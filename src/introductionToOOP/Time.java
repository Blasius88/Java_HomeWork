package introductionToOOP;

import java.util.Scanner;

public class Time {
    public static int sec = 0;
    public static int min = 0;
    public static int hour = 0;
    public int fullSec;


    public static void dataInport() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите время в формате hh:mm:ss");
        String time = sc.next();
        String[] timeSplit = time.split(":");
        Time.hour = Integer.parseInt(timeSplit[0]);
        Time.min = Integer.parseInt(timeSplit[1]);
        Time.sec = Integer.parseInt(timeSplit[2]);
        if (Time.hour > 23) {
            System.out.println("Неправельно введено время");
            return;
        }
        if (Time.min > 59) {
            System.out.println("Неправельно введено время");
            return;
        }
        if (Time.sec > 59) {
            System.out.println("Неправельно введено время");
            return;
        }
        sc.close();
    }

    //Получение полного количества времени
    public static void getTheFullNumberSec(int timeInSec) {
        System.out.println("Выводим время в секундах");
        if (Time.sec != 0) {
            timeInSec += Time.sec;
        }
        if (Time.min != 0) {
            timeInSec += Time.min * 60;
        }
        if (Time.hour != 0) {
            timeInSec += Time.hour * 60 * 60;
        }
        if (timeInSec != 0) {
            printTimeInSec(timeInSec);
        }
    }

    private static void printTimeInSec(int timeInSec) {
        //Конструктор который принемает 1 параметр
        Time time = new Time();
        time.fullSec = timeInSec;
        System.out.println("Время в секундах = " + time.fullSec);
    }

    public static void printTimeInSec(int hour, int min, int sec) {
        //конструцтро который принимает три параметра
        Time time = new Time();
        time.hour = hour;
        time.min = min;
        time.sec = sec;

        System.out.println("Введеное время: " + time.hour + "ч " + time.min + "мин " + time.sec + "сек");
    }
}
