package by.raman.lessons;

public class Lesson2 {
    public static void main(String[] args) {
        int mountNumber = 2;
        if (mountNumber == 12 || mountNumber == 1 || mountNumber == 2) {
            System.out.println("Зима");
        } else if (mountNumber == 3 || mountNumber == 4 || mountNumber == 5) {
            System.out.println("Весна");
        } else if (mountNumber == 6 || mountNumber == 7 || mountNumber == 8) {
            System.out.println("Лето");
        } else if (mountNumber == 9 || mountNumber == 10 || mountNumber == 11) {
            System.out.println("Осень");
        } else {
            System.out.println("Ошибка");
        }
    }
}
