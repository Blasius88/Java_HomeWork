package Lector9.Task9_5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Transact {
    @Transaction(transaction = true)
    public void transact() {
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Transaction {
    boolean transaction() default false;
    String start() default "Transaction is started";
    String end() default "Transaction is ended";

}

