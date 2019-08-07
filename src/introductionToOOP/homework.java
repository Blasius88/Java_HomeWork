package introductionToOOP;

import introductionToOOP.Time;

import introductionToOOP.Bank;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1 -  Создать класс, описывающий промежуток времени. " +
                "Сам промежуток времени должен задаваться тремя свойствами: секундами, минутами и часами. " +
                "Создать метод для получения полного количества секунд в объекте\n" +
                "Создать два конструктора: первый принимает общее количество секунд, второй " +
                "часы, минуты и секунды по отдельности.\n" +
                "Создать метод для вывода данных.\n" +
                "Написать программу для тестирования возможностей класса.\n" +
                "2 - Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате должен задаваться тремя\n" +
                "свойствами: количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.\n" +
                "Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение -\n" +
                "успешность выполнения операции.\n" +
                "При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.\n" +
                "Создать конструктор с тремя параметрами - количеством купюр каждого номинала. \n" +
                "Сделайте выбор: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                task_1();
                break;
            case 2:
                task_2();
                break;
            default:
                System.out.println("Такого пункта нет");
                return;
        }
        sc.close();
    }

    /*Cоздать класс, описывающий промежуток времени. Сам промежуток времени должен задаваться тремя свойствами: секундами,
    минутами и часами.
    Создать метод для получения полного количества секунд в объекте.
    Создать два конструктора: первый принимает общее количество секунд, второй часы, минуты и секунды по отдельности.
    Создать метод для вывода данных.
    Написать программу для тестирования возможностей класса.*/
    public static void task_1() {
        Time.dataInport();
        int timeInSec = 0;
        Time.getTheFullNumberSec(timeInSec);
        Time.printTimeInSec(Time.hour, Time.min, Time.sec);
    }

    //Ввод времени


    /* Создать класс, описывающий банкомат. Набор купюр, находящихся в банкомате должен задаваться тремя
       свойствами: количеством купюр номиналом 20, 50 и 100. Сделать методы для добавления денег в банкомат.
       Сделать функцию, снимающую деньги, которая принимает сумму денег, а возвращает булевое значение - успешность выполнения операции.
       При снятии денег функция должна распечатывать каким количеством купюр какого номинала выдаётся сумма.
       Создать конструктор с тремя параметрами - количеством купюр каждого номинала.*/
    public static void task_2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Загрукзка банкнот\n" +
                "2 - Снятие денег\n" +
                "Сделайте выбор: ");
        int number = sc.nextInt();
        switch (number) {
            case 1:
                download();
                break;
            case 2:
                cashWithdrawal();
                break;
            default:
                break;
        }
    }

    //Загрузка денег в банкомат
    public static void download() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество банкнот: ");
        System.out.print("20  - ");
        Bank.banknote20 = sc.nextInt();
        System.out.print("\n");
        System.out.print("50  - ");
        Bank.banknote50 = sc.nextInt();
        System.out.print("\n");
        System.out.print("100  - ");
        Bank.banknote100 = sc.nextInt();
        System.out.print("\n");
        task_2();
        sc.close();
    }

    //Выдача денег
    public static void cashWithdrawal() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму: ");
        int cashSummu = sc.nextInt();
        if (cashSummu < 100 && cashSummu > 50 && cashSummu % 10 == 0) {
            cashWithdrawalFifty(cashSummu);
        } else if (cashSummu > 19 && cashSummu < 21 && cashSummu < 40) {
            cashWithdrawalTwenty(cashSummu);
        } else if (cashSummu > 100 && cashSummu % 10 == 0) {
            cashWithdrawal(cashSummu);
        } else {
            Bank.err = true;
            errPrint(Bank.err);
        }
        sc.close();
    }

    //Снятие денег из банкомата Выдает 100
    public static void cashWithdrawal(int cashSummu) {
        boolean check = false;
        int tempCashSumm = cashSummu;
        for (int i = Bank.banknote100; i > -1; i--) {
            Bank.banknote100--;
            Bank.amountBanknote100++;
            int temp = Bank.amountBanknote100 * 100;
            tempCashSumm -= temp;
            if (cashSummu == temp) {
                check = true;
                break;
            } else if (cashSummu < temp) {
                Bank.banknote100++;
                Bank.amountBanknote100--;
                break;
            } else if (tempCashSumm < 50) {
                if (tempCashSumm < 20) {
                    Bank.banknote100++;
                    Bank.amountBanknote100--;
                    break;
                } else if (tempCashSumm > 21 && tempCashSumm < 40) {
                    Bank.banknote100++;
                    Bank.amountBanknote100--;
                    break;
                }
            }
        }
        if (!check) {
            cashWithdrawalFifty(cashSummu);
        } else {
            print(Bank.amountBanknote100, Bank.amountBanknote50, Bank.amountBanknote20);
        }
    }

    public static void cashWithdrawalFifty(int cashSummu) {
        cashSummu -= Bank.amountBanknote100 * 100;
        boolean check = false;
        int tempCashSumm = cashSummu;
        if (cashSummu != 0) {
            for (int i = Bank.banknote50; i > -1; i--) {
                Bank.banknote50--;
                Bank.amountBanknote50++;
                int temp = Bank.amountBanknote50 * 50;
                tempCashSumm -= temp;
                if (cashSummu == temp) {
                    check = true;
                    break;
                } else if (cashSummu < temp) {
                    Bank.banknote50++;
                    Bank.amountBanknote50--;
                    break;
                } else if (tempCashSumm < 20) {
                    Bank.banknote50++;
                    Bank.amountBanknote50--;
                    break;
                } else if (tempCashSumm > 21 && tempCashSumm < 40) {
                    Bank.banknote50++;
                    Bank.amountBanknote50--;
                    break;
                }
            }
            if (!check) {
                cashWithdrawalTwenty(cashSummu);
            } else {
                print(Bank.amountBanknote100, Bank.amountBanknote50, Bank.amountBanknote20);
            }
        }
    }

    public static void cashWithdrawalTwenty(int cashSummu) {
        cashSummu -= Bank.amountBanknote50 * 50;
        if (cashSummu != 0) {
            for (int i = Bank.banknote20; i > -1; i--) {
                Bank.banknote20--;
                Bank.amountBanknote20++;
                int temp = Bank.amountBanknote20 * 20;
                if (cashSummu == temp) {
                    break;
                }
            }
        }
        cashSummu -= Bank.amountBanknote20 * 20;
        if (cashSummu != 0) {
            Bank.err = true;
            errPrint(Bank.err);
        } else {
            print(Bank.amountBanknote100, Bank.amountBanknote50, Bank.amountBanknote20);
        }
    }

    //Вывод на экран
    public static void print(int hundres, int fifty, int twenty) {
        System.out.println("Выдано банкнот");
        if (hundres != 0) {
            System.out.println("100 - " + hundres);
        }
        if (fifty != 0) {
            System.out.println("50 - " + fifty);
        }
        if (twenty != 0) {
            System.out.println("20 - " + twenty);
        }
        errPrint(Bank.err);
    }

    public static void errPrint(boolean err) {
        if (err) {
            System.out.println("Банкомат не может выдать такую сумму");
        } else {
            System.out.println("Операция прошла успешна");
        }
    }
}