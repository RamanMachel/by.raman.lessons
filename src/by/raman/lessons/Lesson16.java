package by.raman.lessons;

import java.util.Scanner;

public class Lesson16 {
    public static void main(String[] args) {
        System.out.println("*Вас приветствует конвертер валют*");
        System.out.println("---Как Вас зовут?---");
        Scanner sc = new Scanner(System.in);
        String nameHero = sc.nextLine();
        System.out.println("Очень приятно," + nameHero + "");
        System.out.println("---Какую валюту вы хотите обменять?---");
        System.out.println("1.Российский рубль");
        System.out.println("2.Американский Доллар");
        System.out.println("3.Европейский Евро");
        Scanner sc2 = new Scanner(System.in);
        int currency = sc.nextInt();
        if (currency == 1) {
            System.out.println("Вы выбрали ₽");
            System.out.println("---Сколько ₽ вы хотите обменять?---");
            Scanner sc3 = new Scanner(System.in);
            int money = sc.nextInt();
            currencyRubl(money);
        } else if (currency == 2) {
            System.out.println("Вы выбрали $");
            System.out.println("---Сколько $ вы хотите обменять?---");
            Scanner sc6 = new Scanner(System.in);
            int money = sc6.nextInt();
            currencyDollar(money);

        } else if (currency == 3) {
            System.out.println("Вы выбрали €");
            System.out.println("---Сколько € вы хотите обменять?---");
            Scanner sc8 = new Scanner(System.in);
            int money = sc8.nextInt();
            currencyEuro(money);
        }
        else{
            System.out.println("Вы ввели некорректное значение, ошибка");
            getEndProgram();}
    }

    public static void currencyRubl(int money) {
        System.out.println("---Какую валюту вы хотите получить?---");
        System.out.println("1.Американский Доллар");
        System.out.println("2.Европейский Евро");
        Scanner sc3 = new Scanner(System.in);
        int currency = sc3.nextInt();
        if (currency == 1) {
            double wellDollar = 0.014;
            double total = money * wellDollar;
            System.out.println("1₽ = " + wellDollar + " $");
            System.out.println("Вы получите на руки ---->" + " " + total + " $");
            getEndProgram();
        } else if (currency == 2) {
            double wellEuro = 0.012;
            double total = money * wellEuro;
            System.out.println("1₽ = " + wellEuro + " €");
            System.out.println("Вы получите на руки ---->" + " " + total + " €");
            getEndProgram();

        } else {
            System.out.println("Вы сделали некорректный выбор, попробуйте заного");
            getEndProgram();
        }
    }

    public static void currencyDollar(int money) {
        System.out.println("---Какую валюту вы хотите получить?---");
        System.out.println("1.Российский рубль");
        System.out.println("2.Европейский Евро");
        Scanner sc4 = new Scanner(System.in);
        int currency = sc4.nextInt();
        if (currency == 1) {
            double wellRubl = 73.32;
            double total = money * wellRubl;
            System.out.println("1$ = " + wellRubl + " ₽");
            System.out.println("Вы получите на руки ---->" + " " + total + " ₽");
            getEndProgram();
        } else if (currency == 2) {
            double wellEuro = 0.85;
            double total = money * wellEuro;
            System.out.println("1$ = " + wellEuro + " €");
            System.out.println("Вы получите на руки ---->" + " " + total + " €");
            getEndProgram();
        } else {
            System.out.println("Вы сделали некорректный выбор, попробуйте заного");
            getEndProgram();
        }
    }

    public static void currencyEuro(int money) {
        System.out.println("---Какую валюту вы хотите получить?---");
        System.out.println("1.Российский рубль");
        System.out.println("2.Американский доллар");
        Scanner sc7 = new Scanner(System.in);
        int currency = sc7.nextInt();
        if (currency == 1) {
            double wellRubl = 86.37;
            double total = money * wellRubl;
            System.out.println("1€ = " + wellRubl + " ₽");
            System.out.println("Вы получите на руки ---->" + " " + total + " ₽");
            getEndProgram();
        } else if (currency == 2) {
            double wellDollar = 1.18;
            double total = money * wellDollar;
            System.out.println("1€ = " + wellDollar + " $");
            System.out.println("Вы получите на руки ---->" + " " + total + " $");
            getEndProgram();
        } else {
            System.out.println("Вы сделали некорректный выбор, попробуйте заного");
            getEndProgram();
        }
    }

    public static void getEndProgram() {
        System.out.println("Приятно было познакомиться,надеюсь я Вам помог!");
        System.out.println("*До новых встреч*");
    }
}
