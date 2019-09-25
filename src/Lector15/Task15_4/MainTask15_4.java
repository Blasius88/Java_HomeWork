package Lector15.Task15_4;

import Other.ReadFromConsole;

import java.io.*;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainTask15_4 {
    public static void main(String[] args) {
        try {
            int temp = 0;
            FileInputStream fileInput = null;
            InputStreamReader inputRead = null;
            StringBuffer stringBuffer = new StringBuffer();
            System.out.println("Введите строку нахождения файла");
            String locationFile = ReadFromConsole.readFromConsoleStr();
            File myFile = new File(locationFile);
            fileInput = new FileInputStream(locationFile);
            inputRead = new InputStreamReader(fileInput, "Windows-1251");
            while ((temp = inputRead.read()) != -1) {
                stringBuffer.append((char) temp);
            }
            String text = stringBuffer.toString();
            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(text);
            LinkedList<String> numbers = new LinkedList<>();
            while (matcher.find()) {
                numbers.add(matcher.group());
            }
            int num = 0;
            for (int i = 0; i < numbers.size() - 1; i++) {
                if (numbers.get(i).length() > numbers.get(i + 1).length()) {
                    num = i;
                }
            }
            System.out.println(numbers);
            System.out.println(numbers.get(num));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}