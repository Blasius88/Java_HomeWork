package Lector15.Task15_6;

import Other.ReadFromConsole;

import java.io.File;

public class MainTask15_6 {
    public static void main(String[] args) {
        File myFile = new File(ReadFromConsole.findFile());
        recursion(myFile);
    }

    public static void recursion(File myFile) {
        for (final File file : myFile.listFiles()) {
            if (file.isDirectory()) {
                System.out.println(file.getParent());
                recursion(file);
            } else
                System.out.println(file.getName());
        }
    }
}