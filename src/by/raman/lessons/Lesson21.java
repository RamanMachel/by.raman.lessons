package by.raman.lessons;

import java.util.Random;
import java.util.Scanner;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
 */
public class Lesson21 {
    public static void main(String[] args) {
        System.out.println("Вас приветствует Банк *Синдикат Удачи*");
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.print(" ");
        System.out.println("Как Вас зовут?");
        Scanner sc = new Scanner(System.in);
        String nameHero = sc.nextLine();
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.println("Очень приятно, " + nameHero);
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.println(nameHero + ", сколько денег в рублях ты хочешь вложить?");
        Scanner sc1 = new Scanner(System.in);
        int sumMoney = sc.nextInt();
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.println("Круто, " + sumMoney + "руб-Приличная сумма!");
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.println("Процент за месяц вклада - зависит от твоей удачи," + nameHero);
        System.out.print(" ");
        System.out.println("*****************************");
        System.out.println("Давай попробуем вытянуть билет удачи, ты готов?");
        System.out.print(" ");
        System.out.println("1.Да");
        System.out.print(" ");
        System.out.println("2.Нет");
        Scanner sc2 = new Scanner(System.in);
        int ready = sc.nextInt();
        if (ready == 1) {
            System.out.println("Продолжаем");
            int Lucky = new Random(3).nextInt(7);
            System.out.print(" ");
            System.out.println("*****************************");
            System.out.println("Ну что, Везунчик-" + nameHero + ", твой процент=" + Lucky + "%");
            System.out.print(" ");
            System.out.println("*****************************");
            System.out.println("Ну что, " + nameHero + ",на сколько месяцев будет вклад?");
            Scanner sc3 = new Scanner(System.in);
            int quantityYears = sc.nextInt();
            System.out.print(" ");
            System.out.println("*****************************");
            System.out.println("Хм, " + nameHero + ", ну это твой выбор.");
            System.out.print(" ");
            System.out.println("*****************************");
            System.out.println("Подожди, я считаю....");
            for (int i = 0; i < quantityYears; i++) {
                sumMoney += sumMoney / 100 * Lucky;
            }
            System.out.println("Ты получишь " + sumMoney + "рублей");
        } else if (ready == 2) {
            System.out.println("Очень жаль," + nameHero + ", ну, пока");
        } else
            System.out.println("Очень жаль," + nameHero + ",что ты промолчал, приходи когда готов будешь сделать выбор.");
    }
}