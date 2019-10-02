package Lector18.Task18_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FactoryDump {
    private Map<Detalis, Integer> dumpDetalis = new HashMap<>();

    private Detalis[] detalis = Detalis.values();
    Random random = new Random();

    //add to evry details 0 value
    public FactoryDump() {
        Random random = new Random();
        for (int i = 0; i < detalis.length; i++) {
            dumpDetalis.put(detalis[i], 0);
        }
    }

    //add to dump 20 random details
    public void detailUtill() {
        int randomDetail = 0;
        int value = 0;
        for (int i = 0; i < 20; i++) {
            randomDetail = random.nextInt(detalis.length);
            value = dumpDetalis.get(detalis[randomDetail]) + 1;
            dumpDetalis.put(detalis[randomDetail], value);
        }
    }

    public void infoDetal() {
        for (Map.Entry<Detalis, Integer> o : dumpDetalis.entrySet()) {
            System.out.println(o.getKey() + " " + o.getValue());
        }
    }

    public void putDeatails(Detalis detail) {
        dumpDetalis.put(detail,(dumpDetalis.get(detail)+1));
    }

    public Map<Detalis, Integer> getDetails(Map map) {
        int detail;
        int value;
        for (int i = 0; i < random.nextInt(4); i++) {
            detail = random.nextInt(detalis.length);
            value = dumpDetalis.get(detalis[detail]);
            if (value == 0) {
                while (value <= 1) {
                    value = dumpDetalis.get(detalis[detail]);
                }
                value = dumpDetalis.get(detalis[detail]) - 1;
                dumpDetalis.put(detalis[detail], value);
                value = (int) map.get(detalis[detail]) + 1;
                map.put(detalis[detail], value);
            } else {
                value = dumpDetalis.get(detalis[detail]) - 1;
                map.put(detalis[detail], value);
            }

        }
        return map;
    }
}
