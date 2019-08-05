package homework_2;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сделайте выбор: \n1 - Напишите программу, которая " +
                "печатает массив сначала в обычном порядке, затем в обратном\n" +
                "2 - Напишите программу, заносящую в массив первые 100 " +
                "натуральных чисел, делящихся на 13 или на 17, и печатающую его\n" +
                "3 - Определить сумму элементов целочисленного массива, " +
                "расположенных между ближайшими минимальным и максимальным значениями, " +
                "не включая минимальное и максимальное значение\n" +
                "4 - Создать массив из 3 случайных целых чисел из отрезка [10;99], " +
                "вывести его на экран в строку. Определить и вывести на экран сообщение" +
                " о том, является ли массив строго возрастающей последовательностью.\n" +
                "5 - Создать двухмерный квадратный массив, и заполнить его бабочкой\n" +
                "6 -  Написать метод equals, который определяет, равны ли между" +
                "собой соответствующие элементы 2 -х двумерных массивов\n" +
                "7 - Написать программу, эмулирующую выдачу случайной карты из\n" +
                "колоды в 52 карты. Вывести результат в формате \"Карта of Масть\"" +
                ". Например,\"AceofSpades\". Валет - Jack, Дама - Queen, Король -" +
                "King, Туз - Ace, Червы - Hearts, Пики - Spades, Трефы - Clubs," +
                " Бубны - Diamonds\n" +
                "8* - Написать программу, перемешивающую и печатающую список " +
                "карт в колоде. Воспользоваться результатом предыдущей задачи\n" +
                "9 - Имеется целое число, определить является ли это число простым, " +
                "т.е. делится без остатка только на 1 и себя.\n" +
                "10 - Написать алгоритм расчета факториала , используя циклы (for " +
                "и while\n");
        int number = 0;
        number = sc.nextInt();
        switch (number)
        {
            case 1:
                task_1 ();
                break;
            case 2:
                task_2();
                break;
            case 3:
                task_3();
                break;
            case 4:
                task_4();
                break;
            case 5:
                task_5();
                break;
            case 6:
                task_6();
                break;
            case 7:
                task_7();
                break;
            case 8:
                task_8();
                break;
            case 9:
                task_9();
                break;
            case 10:
                task_10();
                break;
            default:
                System.out.println("Такого пункта нет");
        }
        sc.close();
    }


    /*Напишите программу, которая печатает массив сначала в
    обычном порядке, затем в обратном.*/
    private static void task_1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int[] arr = new int [size];
        for (int i = 0; i < size; i++)
        {
            System.out.println("Введите [" + (i+1) + "] элемент массива ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Выводим массив в обычном порядке");
        for (int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nВыводим массив в обратном порядке");
        for (int i = arr.length - 1; i >-1; i--)
        {
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }

    /*Напишите программу, заносящую в массив первые 100
    натуральных чисел, делящихся на 13 или на 17, и печатающую его.*/
    public static void task_2 () {
        int[] arr = new int[100];
        int num = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                int number = i;
                num++;
                for (int j = num; j < 100; j++)
                    arr[j] = number;
            }
        }
        System.out.println("Выводим массив");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /*Определить сумму элементов целочисленного массива,  расположенных между ближайшими
    минимальным и максимальным значениями, не включая минимальное и максимальное значение.*/
    public static void task_3 ()
    {
        Scanner sc = new Scanner(System.in);
        Random rand  = new Random();
        System.out.println("Введите размер массива");
        int size = sc.nextInt();
        int [] arr = new int [size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = rand.nextInt(30);
            System.out.println((i+1)+" элемент массива = "+ arr[i]);
        }
        int maxPosition = 0;
        int minPosition = 0;
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
                minPosition = i;
            }
            if (arr[i] > max)
            {
                max = arr[i];
                maxPosition = i;
            }
        }
        int amount = 0;
        if (maxPosition < minPosition)
        {
            for (int i = maxPosition + 1; i < minPosition; i++)
            {
                amount +=arr[i];
            }
        }
        else if (maxPosition > minPosition)
        {
            for (int i = minPosition+1; i < maxPosition; i++)
            {
                amount += arr[i];
            }
        }
        else if (maxPosition + 1 == minPosition || maxPosition == minPosition+1)
            System.out.println("Между мин и макс значениями нет элементов массива");

        if (maxPosition > minPosition)
        {
            for (int i = maxPosition + 1; i < minPosition; i++)
            {
                amount +=arr[i];
            }
        }
        else if (maxPosition > minPosition)
        {
            for (int i = minPosition+1; i < maxPosition; i++)
            {
                amount += arr[i];
            }
        }
        else if (maxPosition + 1 == minPosition || maxPosition == minPosition+1)
            System.out.println("Между мин и макс значениями нет элементов массива");

        if (amount != 0)
        {
            System.out.println("Сумма = " + amount);
        }
        sc.close();
    }
    /*Создать массив из 3 случайных целых чисел из отрезка [10;99],
    вывести его на экран в строку. Определить и вывести на экран сообщение о
    том, является ли массив строго возрастающей последовательностью. */
    public static void task_4()
    {
        int[] arr = new int [3];
        for (int i = 0; i < arr.length; i ++)
        {
            arr[i] = (int) (10 + Math.random()*89);
            System.out.print(arr[i] + " ");
        }
        if (arr[0] < arr [1] && arr[1] < arr[2])
        {
            System.out.println("\nМассив строго возрастающий");
        }
        else
        {
            System.out.println("\nМассив не возрастающий");
        }
    }

    /*  Создать двухмерный квадратный массив, и заполнить его "бабочкой",
     т.е. таким образом: */
    public static void task_5()
    {
        String a = "*";
        String b = " ";
        String [][] arr = new String[5][5];
        arr[0][0] = a;
        arr[0][1] = a;
        arr[0][2] = a;
        arr[0][3] = a;
        arr[0][4] = a;
        arr[1][0] = b;
        arr[1][1] = a;
        arr[1][2] = a;
        arr[1][3]= a;
        arr[1][4] = b;
        arr[2][0] = b;
        arr[2][1] = b;
        arr[2][2] = a;
        arr[2][3]= b;
        arr[2][4] = b;
        arr[3][0] = b;
        arr[3][1] = a;
        arr[3][2] = a;
        arr[3][3]= a;
        arr[3][4] = b;
        arr[4][0] = a;
        arr[4][1] = a;
        arr[4][2] = a;
        arr[4][3] = a;
        arr[4][4] = a;
        for (int i = 0; i <5; i++)
        {
            for (int j = 0; j < 5; j ++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    /*Написать метод equals, который определяет, равны ли между
    собой соответствующие элементы 2 - х двумерных массивов.*/
    public static void task_6 ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите длину массива");
        int a  = sc.nextInt();
        System.out.println("Введите высату массива");
        int b = sc.nextInt();
        int [][] arr_1 = new int[a][b];
        int [][] arr_2 = new int [a][b];
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j ++)
            {
                System.out.println("Введите [" + (i+1) + "][" + (j+1) + "] элемент массива ");
                arr_1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введем второй массив ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j ++)
            {
                System.out.println("Введите [" + (i+1) + "][" + (j+1) + "] элемент массива ");
                arr_2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Выведем 1 массив на экран ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j ++)
            {
                System.out.print(arr_1[i][j] + " ");
            }
            System.out.print("\n");
        }
        System.out.println("Выведем 2 массив на экран ");
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j ++)
            {
                System.out.print(arr_2[i][j] + " ");
            }
            System.out.print("\n");
        }
        //запускаем проверку массивов
        boolean check =false;
        for (int i = 0; i < a; i++)
        {
            for (int j = 0; j < b; j ++ )
            {
                if (arr_1.equals( arr_2))
                {
                    check = true;
                }
                else
                {
                    check = false;
                    break;
                }
            }
        }
        if (check == true)
        {
            System.out.println("Массивы  равны");
        }
        else
        {
            System.out.println("Массивы не равны");
        }
        sc.close();
    }

    public static void task_7() {
        int num_card = (int) (2 + Math.random() *12);
        int lear = (int) (1 + Math.random()*3);
        String card = "";
        if (num_card == 11) {
            card += "Jack";
        } else if (num_card == 12) {
            card += "Queen";
        } else if (num_card == 13) {
            card += "King";
        } else if (num_card == 14) {
            card += "Ace";
        } else card = String.valueOf(num_card);
        if (lear == 1) {
            card += " of Heats";
        } else if (lear == 2) {
            card += " of Spades";
        } else if (lear == 3) {
            card += " of Clubs";
        } else {
            card += " of Diamonds";
        }
        System.out.println("Ваша карта: " + card);
    }

    /*Написать программу, перемешивающую и печатающую список карт в колоде.
    Воспользоваться результатом предыдущей задачи.*/
    public static void task_8() {
        int counter = 0;
        String cardFull = "";
        while (counter <53){
            int num_card = (int) (2 + Math.random() *12);
            int lear = (int) (1 + Math.random()*3);
            String [] strings = cardFull.split("|");
            String card ="";
            if (num_card == 11) {
                card += "Jack";
            } else if (num_card == 12) {
                card += "Queen";
            } else if (num_card == 13) {
                card += "King";
            } else if (num_card == 14) {
                card += "Ace";
            } else card = String.valueOf(num_card);
            if (lear == 1) {
                card += " of Heats |";
            } else if (lear == 2) {
                card += " of Spades |";
            } else if (lear == 3) {
                card += " of Clubs |";
            } else {
                card += " of Diamonds |";
            }
            boolean flag = false;
            for (int i = 0; i <strings.length; i++) {
                String part1 = strings[i];
                if (part1 != card )
                {
                    flag = true;
                }
            }
            if (flag)
            {
                cardFull +=card;
            }
            counter++;
        }
        System.out.println(cardFull);
        System.out.println("Колода разложена");
    }

    /*Имеется целое число, определить является ли это число простым, т.е.
    делится без остатка только на 1 и себя*/
    public static void task_9 ()
    {
        Random rand = new Random();
        int number = rand.nextInt(100);
        System.out.println("Число: " + number);
        boolean isComposite = false;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
            {
                isComposite = true;
                break;
            }
        }
        if (isComposite)
        {
            System.out.println("Число составное");
        }
        else
        {
            System.out.println("Число простое");
        }
    }

    /* Написать алгоритм расчета факториала , используя циклы (for и while)*/
    public static void  task_10 ()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = sc.nextInt();
        int factorial = 0;
        // расчет фактариала через for
        for (int i = 1; i <= number; i++)
        {
            factorial += number*i;
        }
        System.out.println("факториал =" + factorial);
        factorial = 0;
        int number1 = number;
        //расчет факториала через while
        while (number > 0)
        {
            factorial +=number*number1;
            number--;
        }
        System.out.println("факториал =" + factorial);
        sc.close();
    }
}

