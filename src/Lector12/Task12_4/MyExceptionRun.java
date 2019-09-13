package Lector12.Task12_4;

public class MyExceptionRun extends RuntimeException {
    private Exception _myExceptionRun;

    public MyExceptionRun(String er, Exception e){
        super (er);
        _myExceptionRun = e;
    }
    public MyExceptionRun(String er){
        super(er);
    }
    public Exception getHiddenException(){
        return(_myExceptionRun);
    }
}
