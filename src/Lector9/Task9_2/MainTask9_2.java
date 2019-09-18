package Lector9.Task9_2;

import Lector9.Task9_1.Pair;

import static Lector9.Task9_2.PairUtil.swap;

public class MainTask9_2 {
    public static void main(String[] args) {
        Pair<Integer, String> ob = new Pair<>(1, "Alice");
        Pair<String, Integer> ob1 = swap (ob);
        System.out.println(ob1.getId());
    }

}