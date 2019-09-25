package Lector15.Task15_1;

import Other.ReadFromConsole;
import jdk.nashorn.internal.runtime.ECMAException;

import java.io.*;
import java.nio.charset.Charset;

public class Start {
    void start() throws IOException {
        try {
            System.out.println("Введите строку нахождения фаийла");
            String locationFile = ReadFromConsole.readFromConsoleStr();
            File myFile = new File(locationFile);
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(locationFile), Charset.forName("Windows-1251")));
            String temp;
            while (null != (temp = reader.readLine())) {
                System.out.println(temp);
            }
            reader.close();
        } catch (Exception excep) {
            System.out.println("Ошибка " + excep);
        }
    }
}