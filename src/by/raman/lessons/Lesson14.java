package by.raman.lessons;

import java.util.Scanner;

public class Lesson14 {
    public static void main(String[] args) {
        System.out.print("Введи год - когда вы хотите сделать вклад");
        Scanner sc = new Scanner(System.in);
        int yearStart = sc.nextInt();
        if (yearStart < 2021) {
            System.out.println("Нельзя вводить год меньше текущего");
        } else {
            System.out.print("Введи год - когда вы хотите хотите забрать деньги");
            Scanner sc2 = new Scanner(System.in);
            int yearEnd = sc2.nextInt();
            int period = yearEnd - yearStart;
            System.out.println("Введите сумму вклада в $, ставка 7% годовых");
            Scanner sc3 = new Scanner(System.in);
            double money = sc3.nextInt();
            double percent = 0.07;
            getCalculate(period, money, percent);
        }
    }

    public static void getCalculate(int amout, double money, double percent) {
        for (int i = 0; i < amout; i++) {
            money += money * percent;
        }
        double totalMoney = getСonversion(money);
        System.out.println("Ваша сумма к выдаче:");
        System.out.println(money + " $");
        System.out.println("---------Или---------");
        System.out.println(totalMoney + " Рублей");
    }

    public static double getСonversion(double money) {
        double rate = 73.3920;
        double totalRubl = money * rate;
        return totalRubl;
    }
}


