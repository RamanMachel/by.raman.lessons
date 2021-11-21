package by.raman.lessons;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите консольную программу, в которую пользователь вводит сумму вклада и количество месяцев.
А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл while. Пусть сумма вклада будет представлять тип double.
 */
public class Lesson30 {
    public static void main(String[] args) {
        double deposit = 1000;
        int month = 10;

        double percent = getPercent();

        getSum(deposit, month, percent);
    }

    private static double getPercent() {
        double percent = 7;
        return percent;
    }

    public static void getSum(double deposit, int month, double percent) {
        for (int i = 0; i < month; i++) {
            deposit += deposit / 100 * percent;
        }
        getPrint(deposit);
    }

    public static void getPrint(double totalSum) {
        System.out.println(totalSum);
    }
}
