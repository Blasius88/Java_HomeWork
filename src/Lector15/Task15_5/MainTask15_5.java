package Lector15.Task15_5;

import Other.ReadFromConsole;
import javafx.scene.control.RadioMenuItem;

import java.io.*;
import java.util.Random;

public class MainTask15_5 {
    public static void main(String[] args) {
        try {
            System.out.println("Введите строку нахождения файла");
            String locationFile = ReadFromConsole.readFromConsoleStr();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(locationFile));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(locationFile));
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                bufferedWriter.write(Integer.toBinaryString(random.nextInt(1) + 255));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            int rez = 0;
            int temp = 0;
            while (bufferedReader.ready()) {
                rez += Integer.valueOf(bufferedReader.readLine(), 2);
                temp++;
            }
            int pr = rez / temp;
            System.out.println(pr);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
