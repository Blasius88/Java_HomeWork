package Lector9.Task9_3;

public class Solution <T extends Integer> extends ClassForGenerics implements InterfaceForGenerics{
    private T value;

    public Solution(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
