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
        MathClass<Number> mathClass = new MathClass<>(a);
        MathClass<Number> mathClass1 = new MathClass<>(b);
        MathUtil.swap(mathClass, mathClass1);
        MathClass<Number> mathClass2 = new MathClass<>(one);
        MathClass<Number> mathClass3 = new MathClass<>(two);
        MathUtil.swap(mathClass2, mathClass3);
    }
}
