package Lector12.Task12_2;

import javax.print.attribute.standard.MediaSize;
import java.util.regex.Matcher;

public class MainTask12_2 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите размер массива");
            int num = Other.ReadFromConsole.readFromConsoleInt();
            getException(num);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    public static void getException (int num){
        int [] arrInt = new int[num];
        for(int i = 0; i <=arrInt.length; i ++)
        {
            System.out.println("Введите " + (i+1) + " элемент массива ");
            arrInt[i]= Other.ReadFromConsole.readFromConsoleInt();
        }

        print(arrInt);
    }

    private static  void print (int[] arrInt)
    {
        for (int i = 0; i < arrInt.length; i ++)
        {
            System.out.println((i+1) + " элемент массива = " + arrInt[i]);
        }
    }
}
