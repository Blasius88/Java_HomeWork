package Lector9.Task9_2;

import Lector9.Task9_1.Pair;

public final class PairUtil {

    private PairUtil(){}

    public static <K, V> Pair <V, K> swap(Pair<K, V> ob) {
        return new Pair<V, K>(ob.getName(), ob.getId());
    }
}
