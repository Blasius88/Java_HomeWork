package Lector16.Task16_3;

import Lector16.Task16_2.MainTask16_2;
import Other.ReadFromConsole;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainTask16_3 {
    public static void main(String[] args) {
        Notebook notebook = new Notebook("HP", "Windows10", "DrWeb", "good", "Omen");
        System.out.println("Серелизация прошла ?" + new MainTask16_2().selization(notebook));
        new MainTask16_3().deserilizacion();
    }

    private void deserilizacion() {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(ReadFromConsole.findFile());
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Notebook newNote = (Notebook) ois.readObject();
                System.out.println("название " + newNote.getName()
                        + "\nОС " + newNote.getOs()
                        + "\nантивирус " + newNote.getAntivirus()
                        + "\nКоментарии " + newNote.getComint()
                        + "\nМодель " + newNote.getModel());
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}