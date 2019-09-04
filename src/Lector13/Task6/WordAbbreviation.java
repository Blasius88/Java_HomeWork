package Lector13.Task6;

public class WordAbbreviation {
    public static void wordAbbreviation(String str){
        char[] chars = str.toCharArray();
        String result = "";
        int num = chars.length -2;
        for (int i = 0; i < chars.length - 1; i++){
            if (chars[i] != chars[i+1]){
                result +=chars[i];
            }
            if (i == (num)){
                result += chars[i+1];
            }
        }
        System.out.println(result);
    }
}
