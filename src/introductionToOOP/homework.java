package introductionToOOP;
import introductionToOOP.Time;
import java.util.Scanner;

public class homework {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 -  Создать класс, описывающий промежуток времени. " +
                "Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами. " +
                "Создать метод для получения полного количества секунд в объекте\n" +
                "Создать два конструктора: первый принимает общее количество секунд, второй " +
                "часы, минуты и секунды по отдельности.\n" +
                "Создать метод для вывода данных.\n" +
                "Написать программу для тестирования возможностей класса.\n" +
                "2 - Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате должен задаваться тремя\n" +
                "свойствами: количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.\n" +
                "Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -\n" +
                "успешность выполнения операции.\n" +
                "При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.\n" +
                "Создать конструктор с тремя параметрами - количеством купюр каждого номинала." +
                "Сделайте выбор: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                task_1();
                break;
            case 2:
                break;
            default:
                System.out.println("Такого пункта нет");
                return;
        }
    }

    /*Cоздать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами,
    минутами и часами.
    Создать метод для получения полного количества секунд в объекте.
    Создать два конструктора: первый принимает общее количество секунд, второй часы, минуты и секунды по отдельности.
    Создать метод для вывода данных.
    Написать программу для тестирования возможностей класса.*/
        public static void task_1 ()
        {
            dataInport ();
            int timeInSec = 0;
            getTheFullNumberSec(timeInSec);
            printTimeInSec (Time.hour, Time.min, Time.sec);
        }

        //Ввод времени
        private static void dataInport()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите время в формате hh:mm:ss");
            String time  = sc.next();
            String [] timeSplit = time.split(":");
            Time.hour = Integer.parseInt(timeSplit[0]);
            Time.min = Integer.parseInt(timeSplit[1]);
            Time.sec = Integer.parseInt(timeSplit[2]);
            if (Time.hour > 23)
            {
                System.out.println("Неправельно введено время");
                return;
            }
            if (Time.min > 59)
            {
                System.out.println("Неправельно введено время");
                return;
            }
            if (Time.sec > 59)
            {
                System.out.println("Неправельно введено время");
                return;
            }
            sc.close();
        }

        //Получение полного количества времени
        private static void getTheFullNumberSec (int timeInSec)
        {
            System.out.println("Выводим время в секундах");
            if (Time.sec != 0)
            {
                timeInSec += Time.sec;
            }
            if (Time.min != 0)
            {
                timeInSec += Time.min*60;
            }
            if (Time.hour != 0)
            {
                timeInSec += Time.hour*60*60;
            }
            if (timeInSec != 0)
            {
                printTimeInSec (timeInSec);
            }
        }
        private static void printTimeInSec(int timeInSec)
        {
            //Конструктор который принемает 1 параметр
            Time time = new Time();
            time.fullSec = timeInSec;
            System.out.println("Время в секундах = " + time.fullSec);
        }

        private static void printTimeInSec(int hour, int min, int sec)
        {
            //конструцтро который принимает три параметра
            Time time = new Time();
            time.hour = hour;
            time.min = min;
            time.sec = sec;

            System.out.println("Введеное время: " + time.hour + "ч "+ time.min + "мин " +time.sec +"сек");
        }
}
