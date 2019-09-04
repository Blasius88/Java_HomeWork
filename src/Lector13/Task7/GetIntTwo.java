package Lector13.Task7;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

public class GetIntTwo {
    public static long m = 0;

    public static String getIntTwo(int num) {
        Long m = System.nanoTime();
        String str1 = "";
        str1 += num;
        String str = "";
        String outgoingLine = "0000000000";
        char[] chars = outgoingLine.toCharArray();
        char[] chars1 = str1.toCharArray();
        int col = chars1.length;
        for (int i = chars.length - 1; i > 0; i--) {
            if (col > 0) {
                for (int j = col - 1; j >= 0; j--) {
                    chars[i] = chars1[j];
                    col--;
                    break;
                }
            }
        }
        if (chars.length >= chars1.length) {
            for (int i = 0; i < chars.length; i++)
                str += chars[i];
        } else str = "0000000000";
        m = System.nanoTime() - m;
        System.out.printf("Функция выполнялось %,9.3f ms\n", m / 1_000_000.0);
        return str;
    }
}
