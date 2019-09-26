package Lector15.Task15_5;

import Other.ReadFromConsole;
import javafx.scene.control.RadioMenuItem;

import java.io.*;
import java.util.Random;

public class MainTask15_5 {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(ReadFromConsole.findFile()));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(ReadFromConsole.findFile()));
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
