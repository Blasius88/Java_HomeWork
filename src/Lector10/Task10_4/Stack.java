package Lector10.Task10_4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stack {
    private List stack = new ArrayList();

    public Stack() {
        System.out.println("Создан безразмерный стек !");
    }

    public Stack(int size) {
        stack = new ArrayList(size);
        System.out.println("Создан стек размером " + size);
    }

    public Object getNumer(int i) {
        return stack.get(i);
    }
    public void setNumer(Object numer) {
        stack.add(numer);
    }

    public String numerFromEnd() {
        List stackFromEnd = new ArrayList();
        for (int i = stack.size() - 1; i >= 0; --i) {
            stackFromEnd.add(stack.get(i));
        }
        String ans = "";
        Iterator iterator = stackFromEnd.listIterator();
        while (iterator.hasNext()) {
            ans+= iterator.next().toString();
        }
        return ans;
    }
}
