package Lector14.Task14_5;

import Other.ReadFromConsole;

public class MainTask14_5 {
    public static void main(String[] args) {
        System.out.println("Введите IPv4");
        String ipText = ReadFromConsole.readFromConsoleStr();
        checkIp(ipText);
    }

    private static void checkIp(String ipText) {
        boolean check_ = ipText.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}");
        boolean rightly = false;
        if (check_ == true) {
            String[] strArr = ipText.split("\\.");
            for (int i = 0; i < strArr.length; i++) {
                int num = Integer.valueOf(strArr[i]);
                if (num > -1 && num < 256) {
                    if (num < 10) {
                        rightly = strArr[i].matches("\\d");
                        if (rightly == false)
                            break;
                    } else if (num > 9 && num < 100) {
                        rightly = strArr[i].matches("\\d{2}");
                        if (rightly == false)
                            break;
                    }
                }
            }
        }
        if (rightly == true) {
            System.out.println("IPv4 введен верно");
        } else {
            err();
        }


    }

    private static void err() {
        System.out.println("IPv4 введен неверно");
    }
}
