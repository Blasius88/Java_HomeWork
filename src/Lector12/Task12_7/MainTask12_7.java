package Lector12.Task12_7;

import Other.ReadFromConsole;
import com.sun.nio.sctp.IllegalReceiveException;
import sun.plugin2.message.Message;

import java.util.Random;

public class MainTask12_7 {
    public static void main(String[] args) {
        try {
            int a = (int) (1 + Math.random() * 2);
            switch (a) {
                case 1:
                    System.out.println("Введте число ");
                    int num = ReadFromConsole.readFromConsoleInt();
                    errExcep(num);
                    break;
                case 2:
                    int result = getAreaValue(-1, 100);
                    break;
                case 3:
                    System.out.println("Введте число ");
                    num = ReadFromConsole.readFromConsoleInt();
                    arrStrErr(num);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Отработал finaly");
        }
    }
    private static void arrStrErr (int num)
    {
        String[] arrStr = new String[num];
        for (int i = 0;  i < num; i++)
        {
            if (i == (num - 1))
            {
                i++;
            }
            else
            {
                System.out.println("Введите " + (i + 1) + " элемент массива ");
                arrStr[i] = ReadFromConsole.readFromConsoleStr();
            }
        }
        lineErr(arrStr);
    }

    private static void lineErr(String[] arrStr)
    {
        for (int i = 0; i <arrStr.length; i++)
        if (arrStr[i] == "" || arrStr[i] == null)
        {
            throw new NullPointerException("Ошибка не введена строка NullPointerException");
        }
    }
    private static void errExcep(int num) {
        int[] arrInt = new int[num];
        for (int i = 0; i <= arrInt.length; i++) {
            System.out.println("Введите " + (i + 1) + " элемент массива ");
            arrInt[i] = ReadFromConsole.readFromConsoleInt();
        }

        print(arrInt);
    }

    private static void print(int[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            System.out.println((i + 1) + " элемент массива = " + arrInt[i]);
        }
    }

    private static int getAreaValue (int x, int y ){
        if (x<0 || y< 0) throw new IllegalReceiveException();
        return x*y;
    }
}
