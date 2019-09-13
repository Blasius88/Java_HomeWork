package Lector12.Task12_3;

public class MainTask12_3 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите слово");
            String str = Other.ReadFromConsole.readFromConsoleStr();
            checkExcep(str);
        } catch (MyExcepcion e) {
            e.printStackTrace();
        }
    }

    public static void checkExcep(String str) throws MyExcepcion {
        if ("fuck".equals(str)) {
            str = "stacktrace";
            throw new MyExcepcion("Ошибка " + str);
        }
    }
}
