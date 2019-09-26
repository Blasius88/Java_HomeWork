package Lector15.Task15_1;

import Other.ReadFromConsole;
import jdk.nashorn.internal.runtime.ECMAException;

import java.io.*;
import java.nio.charset.Charset;

public class Start {
    void start() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(ReadFromConsole.findFile()), Charset.forName("Windows-1251")));
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