package by.raman.lessons;
/*
Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что:
первый и второй члены последовательности равны единицам
а каждый следующий — сумме двух предыдущих
То есть числа Фибоначчи - это 1  1  2  3  5  8  13  21  34  55  89  и т.д.
 */
public class Lesson11 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;
        int z;
        for (int i = 1; i <11 ; i++) {
            z = x+y;
            System.out.println(z+"");
            x=y;
            y=z;
        }
    }
}
