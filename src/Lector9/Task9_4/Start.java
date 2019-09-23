package Lector9.Task9_4;

import Other.ReadFromConsole;

public class Start {
    public static void start(){
        System.out.println("Введите 1 число");
        int a = ReadFromConsole.readFromConsoleInt();
        System.out.println("Введите 2 число");
        int b = ReadFromConsole.readFromConsoleInt();
        System.out.println("Введите 1 вещественное число");
        double one = ReadFromConsole.readFromConsoleDouble();
        System.out.println("Введите 2 веществаенное число");
        double two = ReadFromConsole.readFromConsoleDouble();
        MathClass<Number, Number> mathClass = new MathClass<>();
        System.out.println("Sum one :" + mathClass.division(a,b));
        System.out.println("Sum two :" + mathClass.division(one,two));
    }
}
