package Lector9.Task9_4;

public class MathClass <T extends  Number, V extends Number>{
    private T num1;
    private V num2;

    public MathClass(){}
    public MathClass(T Num1, V Num2){
        this.num1 = Num1;
        this.num2 = Num2;
    }

    public T getNum1() {
        return num1;
    }
    public void setNum1(T num1) {
        this.num1 = num1;
    }

    public V getNum2() {
        return num2;
    }
    public void setNum2(V num2) {
        this.num2 = num2;
    }

       public double division(T num1, V num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
