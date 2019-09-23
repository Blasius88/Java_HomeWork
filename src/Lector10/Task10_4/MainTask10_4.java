package Lector10.Task10_4;

import Other.ReadFromConsole;

public class MainTask10_4 {
    public static void main(String[] args) {
        System.out.println("Введите размер стека");
        int size = ReadFromConsole.readFromConsoleInt();
        Stack stack = new Stack(size);
        for (int i  = 0; i< size; i ++)
        {
            System.out.printf("%d ", (i +1));
            stack.setNumer(ReadFromConsole.readFromConsoleInt());
        }
        System.out.println("Какой элемент стека извлечь ?");
        System.out.println("элемент: " + stack.getNumer(((ReadFromConsole.readFromConsoleInt() - 1 ))));
        System.out.println("стек в обратном порядке " + stack.numerFromEnd());
    }
}
