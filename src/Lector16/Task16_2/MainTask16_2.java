package Lector16.Task16_2;

import Lector9.Task9_5.MainTask9_5;
import Other.ReadFromConsole;

import java.io.*;

public class MainTask16_2 {
    public static void main(String[] args) {
        Computer comp = new Computer("HP", "Windows10", "DrWeb");
        System.out.println("Серелизация прошла ?" + new MainTask16_2().selization(comp));
        new MainTask16_2().deserilizacion();
    }

    public boolean selization(Computer comp) {
        boolean flag = false;
        ObjectOutputStream oos = null;
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(ReadFromConsole.findFile());
            if (fos != null) {
                oos = new ObjectOutputStream(fos);
                oos.writeObject(comp);
                flag = true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return flag;
    }

    public void deserilizacion() {
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(ReadFromConsole.findFile());
            if (fis != null) {
                ois = new ObjectInputStream(fis);
                Computer newComp = (Computer) ois.readObject();
                System.out.println("название " + newComp.getName() + "\nОС " + newComp.getOs() + "\nантивирус " + newComp.getAntivirus());
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
