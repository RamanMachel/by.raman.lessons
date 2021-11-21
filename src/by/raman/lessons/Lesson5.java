package by.raman.lessons;

public class Lesson5 {
    public static void main(String[] args) {
        int monthNumber = 10;
        switch (monthNumber) {
            case 12, 1, 2 -> System.out.println("Зима");
            case 3, 4, 5 -> System.out.println("Весна");
            case 6, 7, 8 -> System.out.println("Лето");
            case 9, 10, 11 -> System.out.println("Осень");
            default -> System.out.println("Ошибка");
        }
    }
}
