package Lector12.Task12_1;

import Other.*;

public class MainTask12_1 {
    public static void main(String[] args) {
        try{
            System.out.println("Введите строку");
            int str = ReadFromConsole.readFromConsoleInt();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
