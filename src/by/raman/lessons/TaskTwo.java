package by.raman.lessons;

/*/
 Написать функцию, которая принимает 2 целочисленных параметра, и возвращает наибольший из них.
 */
public class TaskTwo {
    public static void main(String[] args) {
        int numberOne = -9;
        int numberTwo = 9;
        int result = calculateMax(numberOne, numberTwo);
        System.out.println("Число: " + result + " является наибольшим");
    }

    public static int calculateMax(int numberOne, int numberTwo) {
        int result = numberOne;
        if (numberOne > numberTwo) {
            result = numberOne;
        } else if (numberOne < numberTwo) {
            result = numberTwo;
        } else {
            System.out.println("Числа равнозначны");
        }
        return result;

    }
}
