package Lector16.Task16_1;

import Other.ReadFromConsole;

import java.io.*;

public class MainTask16_1Buffer {
    public static void main(String[] args) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        int cycle = 5242880; // запись одного символа char в фаил что бы получилось 5 мБ
        String locationFile = ReadFromConsole.findFile();
        try {
            bw = new BufferedWriter( new FileWriter(locationFile));
            br = new BufferedReader(new FileReader(locationFile));
            long temp1 = System.nanoTime();
            for (int i = 0; i < cycle; i ++)
            {
                bw.write('a');
            }
            long temp2 = System.nanoTime();
            while (br.ready())
            {
                br.read();
            }
            long temp3 = System.nanoTime();
            System.out.printf("запись %d\nчтение %d",temp2 - temp1, temp3 - temp2);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
