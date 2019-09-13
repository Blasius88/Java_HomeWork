package Lector12.Task12_5;

public class MyExceptionTwo extends Exception {
    private Exception _myExceptionTwo;

    public MyExceptionTwo(String ex, Exception e){
        super(ex, e);
        _myExceptionTwo = e;
    }
    public MyExceptionTwo(String ex)
    {
        super(ex);
    }
    public Exception getHiddenException()
    {
        return (_myExceptionTwo);
    }
}
