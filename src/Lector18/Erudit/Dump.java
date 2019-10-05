package Lector18.Erudit;

import java.util.HashMap;
import java.util.Map;

public class Dump {
    static Map<Details, Integer> dump;
    Dump() {
        dump = new HashMap<>();
    }

    void put(Details detail) {
        dump.put(detail, dump.get(detail) == null ? 1 : dump.get(detail) + 1);
    }

    int colDetails(Dump dump) {
        int sum = 0;
        for (Map.Entry<Details, Integer> m : dump.dump.entrySet()) {
            sum += m.getValue();
        }
        return sum;
    }

    static void get(Details detail) {
        if (!Dump.noDetails(detail)) {
            Adherent.details.put(detail, Adherent.details.get(detail) == null ? 1 : Adherent.details.get(detail) + 1);
            for (Map.Entry<Details, Integer> m : dump.entrySet()) {
                if (m.getKey() == detail && dump.get(detail) != 0) {
                    dump.put(detail, dump.get(detail) - 1);
                }
            }
        }
    }

    static boolean noDetails(Details detail) {
        boolean b = false;
        if (dump.get(detail) == null) {
            b = true;
        }
        return b;
    }
}