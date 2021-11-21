package by.raman.lessons;
/*
7. Написать функцию, которая принимает один целочисленный параметр и возвращает значение,
равное этому параметру, возведенному в куб.
 */
public class TaskThree {
    public static void main(String[] args) {
        int value = 8;
        int result = getCubeNumber(value);
        System.out.println(result);
    }

    public static int getCubeNumber(int value) {
        value = value * value * value;
        return value;
    }
}
