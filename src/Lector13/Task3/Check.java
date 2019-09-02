package Lector13.Task3;


public class Check {
    public static boolean check(String str, String word) {
        boolean check1 = false;
        String[] strArray = str.split(" ");
        for (int i = 0; i < strArray.length ; i++ )
        {
            int check_one_word = strArray[i].compareTo(word);
            if (check_one_word == 0)
            {
                for (int j = strArray.length - 1; ; )
                {
                    int check_last_word = strArray[j].compareTo(word);
                    if (check_last_word == 0)
                    {
                        check1 = true;
                        break;
                    }
                    else
                        {
                        break;
                    }
                }
            }
            else
                {
                break;
            }
        }
        return check1;
    }
}

