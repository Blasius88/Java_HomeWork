package Lector11.Task11_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainTask11_2 {
    public static void main(String[] args) {
        Map<String, String> elem = new HashMap<>();
        elem.put("Kristin", "Roberts");
        elem.put("Eric", "Toms");
        elem.put("Bret", "Pitt");
        elem.put("Julia", "Roberts");
        elem.put("Viki", "Pitt");
        System.out.println("Два различных ключа не соответствует двум одинаковым значениям? " + inUnique(elem));
    }

    private static boolean inUnique(Map<String, String> map) {
        ArrayList arrayList = new ArrayList(map.values());
        System.out.println(arrayList);
        boolean flag = true;
        for (int i = 0; i < arrayList.size(); i++) {
            for (int j = 0; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j)) && i != j) {
                    flag = false;
                }
            }
        }
        return flag;
    }
}