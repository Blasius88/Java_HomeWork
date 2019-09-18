package Lector9.Task9_4;

public class MathClass <T>{
    private T Num1;

    public MathClass(){}
    public MathClass(T Num1){
        this.Num1 = Num1;
    }

    public T getNum1() {
        return Num1;
    }
    public void setNum1(T num1) {
        Num1 = num1;
    }
}
