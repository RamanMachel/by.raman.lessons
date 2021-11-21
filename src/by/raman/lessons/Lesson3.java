package by.raman.lessons;

public class Lesson3 {
    public static void main(String[] args) {
        int dayNumber = -2;
        if (dayNumber==6||dayNumber==7){
            System.out.println("Выходной");
        }
        else if (dayNumber>0&&dayNumber<6){
            System.out.println("Будник");
        }
        else {
            System.out.println("Ошибка");
        }
    }
}
