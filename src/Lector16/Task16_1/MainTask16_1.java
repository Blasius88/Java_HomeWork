package Lector16.Task16_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;

public class MainTask16_1 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {} catch (Exception excp){}finally {
            if (fis != null)
            {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
