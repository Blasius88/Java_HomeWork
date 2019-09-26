package Lector15.Task15_3;

import Other.ReadFromConsole;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class MainTask15_3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = null;
            InputStreamReader inputRead = null;
            ArrayList<Character> arrChart = new ArrayList<>();
            StringBuffer strBuf = new StringBuffer();
            fileInput = new FileInputStream(ReadFromConsole.findFile());
            inputRead = new InputStreamReader(fileInput, "Windows-1251");
            int num = 0;
            while ((num = inputRead.read()) != -1) {
                arrChart.add((char) num);
            }
            char chBuf = '0';
            for (int i = 0; i < arrChart.size(); i++) {
                if (arrChart.get(i) == ' ') {
                    continue;
                }
                if (!Character.isDigit(arrChart.get(i))) {
                    chBuf = arrChart.get(i);
                }
                if (arrChart.get(i) == chBuf) {
                    while (arrChart.get(i) != ' ') {
                        strBuf.append(arrChart.get(i));
                        i++;
                    }
                    strBuf.append(' ');
                }
            }
            System.out.println(strBuf);
        } catch (Exception excep) {
            excep.printStackTrace();
        }
    }
}