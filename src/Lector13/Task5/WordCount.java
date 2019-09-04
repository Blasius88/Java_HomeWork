package Lector13.Task5;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

public class WordCount {
    public static void wordCount (String str){
        int count = 0;
        String[] strArr = str.split(" +");
        for (int i = 0; i < strArr.length; i ++){
            count++;
        }
        System.out.println("Слов в тексте: " + count);
    }
}
