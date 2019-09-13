package Lector12.Task12_4;

import Lector12.Task12_3.MyExcepcion;
import Other.ReadFromConsole;

import javax.print.attribute.standard.MediaSize;

public class MainTask12_4 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите число больше 0");
            int num = ReadFromConsole.readFromConsoleInt();
            errExcep(num);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void errExcep (int num) throws MyExceptionRun
    {
        if (num < 0 )
        {
            throw new MyExceptionRun("Ошибка ");
        }

    }
}
