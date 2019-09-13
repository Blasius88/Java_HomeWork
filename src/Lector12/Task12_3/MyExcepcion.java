package Lector12.Task12_3;

import java.security.spec.ECField;

public class MyExcepcion extends Exception{
    private Exception _myException;

    public MyExcepcion (String er, Exception e){
        super (er);
        _myException = e;
    }
    public MyExcepcion(String er){
        super(er);
    }
    public Exception getHiddenException(){
        return(_myException);
    }
}
