package Lector11.Task11_3;

import java.util.HashMap;
import java.util.Map;

public class MainTask11_3 {
    public static void main(String[] args) {
        Map<Integer, String> values = new HashMap<>();
        values.put(6, "a");
        values.put(4,"b");
        values.put(3,"c");
        values.put(1,"d");
        values.put(0,"8");
        String res = values.get(6)+"x^6 + "+values.get(4)+"x^4 + "+values.get(3)+"x^3 + "+values.get(1)+"x + "+values.get(0);
        System.out.println(res);

    }
}
