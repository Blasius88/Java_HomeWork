package Lector13.Task7;

public class GetInt {
    public static String getInt(int num) {
        Long m = System.nanoTime();
        String str = "";
        if (num > 9999999999L) {
            str += "0000000000";
        }
        else {
            if (num < 10) {
                str += "000000000" + num;
            } else if (num > 9 && num < 100) {
                str += "00000000" + num;
            } else if (num > 99 && num < 1000) {
                str += "0000000" + num;
            } else if (num > 999 && num < 10000) {
                str += "000000" + num;
            } else if (num > 9999 && num < 100000) {
                str += "00000" + num;
            } else if (num > 99999 && num < 1000000) {
                str += "0000" + num;
            } else if (num > 999999 && num < 10000000) {
                str += "000" + num;
            } else if (num > 9999999 && num < 100000000) {
                str += "00" + num;
            } else if (num > 99999999 && num < 1000000000) {
                str += "0" + num;
            } else if (num > 999999999 && num < 10000000000L) {
                str += num;
            }
        }
        m = System.nanoTime() - m;
        System.out.printf("Функция выполнялось %,9.3f ms\n", m / 1_000_000.0);
        return str;
    }
}