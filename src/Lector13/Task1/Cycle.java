package Lector13.Task1;

public class Cycle {


    //1567356240178
    public static void task1 (String str)
    {
        for (int i = 0; i < 10; i ++)
        {
            str +=str;
            System.out.println(str);
        }
    }

    public static void task1_1 (String str) {
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            strB.append(str) ;
            System.out.println(strB);
        }
    }
}
