package Lector11.Task11_3;

import java.util.HashMap;
import java.util.Map;

public class MainTask11_3 {
    public static void main(String[] args) {
        Map<Integer, String> values = new HashMap<>();
        values.put(8,"a");
        values.put(6,"b");
        values.put(4,"c");
        values.put(2,"d");
        values.put(1,"8");


        String res = values.get(8)+"x^6 + "+values.get(6)+"x^4 + "+values.get(4)+"x^3 + "+values.get(2)+"x + "+values.get(1);
        System.out.println(res);

    }
}
