package Lector16.Task16_1;

import Other.ReadFromConsole;

import java.io.*;
import java.lang.reflect.Field;

public class MainTask16_1 {
    public static void main(String[] args) {
        OutputStreamWriter osw = null;
        InputStreamReader isr = null;
        int cycle = 5242880; // запись одного символа char в фаил что бы получилось 5 мБ
        String locationFile = ReadFromConsole.findFile();
        try {
            osw = new OutputStreamWriter(new FileOutputStream(locationFile));
            isr = new InputStreamReader(new FileInputStream(locationFile));
            long temp1 = System.nanoTime();
            for (int i = 0; i < cycle; i ++)
            {
                osw.write("a");
            }
            long temp2 =System.nanoTime();
            while (isr.ready()){
                isr.ready();
            }
            long temp3 = System.nanoTime();
            System.out.printf("запись %d\nЧтение %d", temp2 - temp1, temp3 - temp2);
        } catch (Exception excp){
            excp.printStackTrace();
        }
        finally {
            if (isr != null)
            {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null)
            {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
