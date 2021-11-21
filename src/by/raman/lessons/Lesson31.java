package by.raman.lessons;

/*
В 1626 году индейцы продали Манхэттен за 24$.
    Написать программу, которая высчитывает сумму,
    получившуюся бы в текущем году, если бы индейцы положили эти деньги в банк под 5% годовых.
 */
public class Lesson31 {
    public static void main(String[] args) {
        int startYear = 1626;
        int thisYear = 2021;
        double money = 24;

        int period = getPeriod(startYear, thisYear);

        double totalSum = getTotalSum(period, money);

        System.out.println(totalSum);
    }

    public static int getPeriod(int startYear, int thisYear) {
        int period = thisYear - startYear;
        return period;
    }

    public static double getTotalSum(int period, double money) {
        for (int i = 0; i < period; i++) {
            money += money / 100 * 5;
        }
        return money;
    }
}
