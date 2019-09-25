package Lector15.Task15_2;

import Other.ReadFromConsole;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.LinkedList;

public class StartTask15_2 {
    public void start() {
        try {
            FileInputStream fileInput = null;
            InputStreamReader inputRead = null;
            int b = 0;
            LinkedList<String> linkedList = new LinkedList<>();
            System.out.println("Введите строку нахождения фаийла");
            String locationFile = ReadFromConsole.readFromConsoleStr();
            File myFile = new File(locationFile);
            fileInput = new FileInputStream(locationFile);
            inputRead = new InputStreamReader(fileInput, "Windows-1251");
            while ((b = inputRead.read()) != -1) {
                if (Character.isSpaceChar((char) b)) {
                    b = inputRead.read();
                    if (isVowels((char) b)) {
                        while (true) {
                            if ((char) b == ' ' || (char) b == '\n') {
                                System.out.println(" ");
                                break;
                            } else {
                                System.out.print((char) b);
                                b = inputRead.read();
                            }
                        }
                    }
                }
            }
            inputRead.close();
            fileInput.close();
        } catch (Exception excep) {
            excep.printStackTrace();
        }
    }

    public static boolean isVowels(char a) {
        String z = Character.toString(Character.toLowerCase(a));
        return z.matches("a|e|u|i|o|а|у|е|ы|а|о|э|ю|и|я");
    }
}
