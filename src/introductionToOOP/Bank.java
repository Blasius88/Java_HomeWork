package introductionToOOP;

import java.util.Scanner;

public class Bank {
    public static int banknote20 = 10; // загружаная банкнота
    public static int banknote50 = 10;// загружаная банкнота
    public static int banknote100 = 10;// загружаная банкнота
    public static int amountBanknote20 = 0;// Выгружанаяя банкнота
    public static int amountBanknote50 = 0;// выгруженая банкнота
    public static int amountBanknote100 = 0;// Выгруженая банкнота
    public static boolean err = false; // проверяем на ошибку

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
        homework.task_2();
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
            cashWithdrawalHundred(cashSummu);
        } else {
            Bank.err = true;
            errPrint(Bank.err);
        }
        sc.close();
    }

    //Снятие денег из банкомата Выдает 100
    private static void cashWithdrawalHundred(int cashSummu) {
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

    private static void cashWithdrawalFifty(int cashSummu) {
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

    private static void cashWithdrawalTwenty(int cashSummu) {
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
    private static void print(int hundres, int fifty, int twenty) {
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

    private static void errPrint(boolean err) {
        if (err) {
            System.out.println("Банкомат не может выдать такую сумму");
        } else {
            System.out.println("Операция прошла успешна");
        }
    }
}
