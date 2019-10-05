package Lector11.Task11_4;

import java.util.*;

public class BlackBox {
    private List<Integer> numbers;


    BlackBox() {
        numbers = new ArrayList<>();
    }


    void addToBox(Integer num) {
        numbers.add(num);
    }

    List<Integer> getNumbers() {
        return numbers;
    }

    Integer min(int k) {
        Set<Integer> set = new HashSet<>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        Collections.sort(numbers);

        if (k > 0 && k <= numbers.size()) {
            return numbers.get(k - 1);
        } else {
            throw new IllegalArgumentException();
        }
    }


    Integer max(int n) {
        Set<Integer> set = new HashSet<>();
        set.addAll(numbers);
        numbers.clear();
        numbers.addAll(set);
        Collections.sort(numbers);
        Collections.reverse(numbers);

        if (n > 0 && n <= numbers.size()) {
            return numbers.get(n - 1);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
