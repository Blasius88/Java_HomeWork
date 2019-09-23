package Lector11.Task11_4;

import java.util.*;

public class MainTask11_4 {
    public static void main(String[] args) {
        blackBox();
    }
    private static void blackBox() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            treeSet.add(random.nextInt(100) + 1);
        }
        ArrayList<Integer> blackBox = new ArrayList<>();
        blackBox.addAll(treeSet);
        System.out.println(blackBox);
        System.out.println(kMin(blackBox, 2));
        System.out.println(nMax(blackBox, 4));
    }
    private static Integer nMax(ArrayList<Integer> blackBox, int n) {
        ListIterator iterator = blackBox.listIterator();
        while(iterator.hasNext()){
            iterator.next();
        }
        int nx = blackBox.size();
        n=nx-n;
        while (iterator.hasPrevious()) {
            if (nx == n) {
                return (Integer) iterator.previous();
            }
            iterator.previous();
            nx--;
        }
        return 0;
    }

    private static Integer kMin(ArrayList<Integer> blackBox, int k) {
        Iterator iterator = blackBox.iterator();
        int kx = 0;
        while (iterator.hasNext()) {
            if (kx == k) {
                return (Integer) iterator.next();
            }
            iterator.next();
            kx++;
        }
        return 0;
    }
}
