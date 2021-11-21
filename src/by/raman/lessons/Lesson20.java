package by.raman.lessons;

/*
В стране XYZ население равно 10 миллионов человек.
Рождаемость составляет 14 человек на 1000 человек, смертность - 8 человек.
Каждый год рождается и умирает на 1 человек, меньше чем в предыдущий год. Р
ассчитайте, какая численность населения будет через 10 лет, учитывая,
что рождаемость не может быть меньше 7 человек на 1000 человек,
а смертностность не может быть меньше 6 человек на 1000 человек.
 */
public class Lesson20 {
    public static void main(String[] args) {
        int population = 10_000_000;
        int fertility = 14;
        int mortality = 8;
        int coefficientPeople = 1000;
        int quantityYears = 10;
        int minimalFertility = 7;
        int minimalMortality = 6;
        getPopulation(quantityYears, population, coefficientPeople, minimalFertility, minimalMortality,
                fertility, mortality);
    }

    public static void getPopulation(int quantityYears, int startPopulation, int coefficientPeople, int minimalFertility, int minimalMortality,
                                     int Fertility, int Mortality) {
        while (quantityYears > 0) {
            quantityYears--;
            if (Fertility > minimalFertility) Fertility--;
            if (Mortality > minimalMortality) Mortality--;
            startPopulation += startPopulation / coefficientPeople * (Fertility - Mortality);
            System.out.println(startPopulation);
        }
    }
}






