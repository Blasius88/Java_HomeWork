package Lector17.Task17_3;

import java.util.HashMap;
import java.util.Map;

public class MainTask17_3 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("123456789", 11);
        map.put("1234567", 2);
        map.put("12345", 5);
        map.put("123", 7);
        int result = map.entrySet().stream().filter(k -> k.getKey().length()<7).mapToInt((value)->value.getValue()).sum();
        System.out.println("Сумма всех значений, длина ключей которых меньше 7 символов = " +result);
    }
}
