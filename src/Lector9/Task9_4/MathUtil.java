package Lector9.Task9_4;

import sun.awt.SunHints;


public class MathUtil {
    private MathUtil() {
    }

    public static void swap(MathClass <Number> num1, MathClass <Number> num2) {
        Number sum = num1.getNum1().intValue() + num2.getNum1().intValue();
        //System.out.println(num1.getNum1(). + num2.getNum1());
        System.out.println(sum);
    }

}