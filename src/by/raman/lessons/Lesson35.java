package by.raman.lessons;
/*
/ Написать программу высчитывающую факториал введённого целого числа.
1*2*3=6
 */
public class Lesson35 {
    public static void main(String[] args) {
        int value = 5;
        int total = calculateFactorial(value);
        System.out.println(total);
    }

    public static int calculateFactorial(int value) {
        int startValue = 1;
        for (int i = 1; i <= value; i++) {
            startValue *= i;
        }
        return startValue;
    }
}
