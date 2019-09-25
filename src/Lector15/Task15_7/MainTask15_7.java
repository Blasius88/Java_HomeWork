package Lector15.Task15_7;

import Other.ReadFromConsole;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class MainTask15_7 {
    public static void main(String[] args) {
        try {
            LinkedList linkedList = new LinkedList();
            System.out.println("Введите строку нахождения файла");
            String locationFile = ReadFromConsole.readFromConsoleStr();
            System.out.println("Введите строку нахождения файла в который будет записан первый файл");
            String locationFile_ = ReadFromConsole.readFromConsoleStr();
            BufferedReader bufferedReader = new BufferedReader(new FileReader(locationFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(locationFile_));
            while (bufferedReader.ready()) {
                linkedList.add((char) bufferedReader.read());
            }
            ListIterator iterator = linkedList.listIterator();
            while (iterator.hasNext()) {
                iterator.next();
            }
            while (iterator.hasPrevious()) {
                bufferedWriter.write((char) iterator.previous());
            }
            bufferedWriter.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
