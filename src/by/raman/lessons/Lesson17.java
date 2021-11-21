package by.raman.lessons;

/*
В стране XYZ население равно 10 миллионов человек. Рождаемость составляет 14 человек на 1000 человек,
смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание,
 что показатели рождаемости и смертности постоянны.
 */
public class Lesson17 {
    public static void main(String[] args) {
        int population = 10_000_000;
        int fertility = 14;
        double mortality = 8;
        int coefficientPeople = 1000;
        double profit = fertility - mortality;
        int quantityYears = 10;
        getPopulation(quantityYears, population, coefficientPeople, profit);
    }
    public static void getPopulation(int quantityYears, int startPopulation, int coefficientPeople, double profit) {
        while (quantityYears > 0) {
            quantityYears--;
            startPopulation += startPopulation / coefficientPeople * profit;
            System.out.println(startPopulation);
        }
    }
}
