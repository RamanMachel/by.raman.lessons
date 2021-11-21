package by.raman.lessons;

import java.util.Random;

/*
5. Имеется последовательность случайных чисел. Найти и вывести наибольшее из них.
 */
public class TaskFour {
    public static void main(String[] args) {
        int[] arrayRandomNumber = new int[10];
        int[] newArray = fillTheArray(arrayRandomNumber);
        calculateMaxNumber(newArray);
    }

    public static int[] fillTheArray(int[] arrayRandomNumber) {
        for (int i = 0; i < arrayRandomNumber.length; i++) {
            int randomNumber = new Random().nextInt(10);
            arrayRandomNumber[i] = randomNumber;
        }
        return arrayRandomNumber;
    }

    public static void calculateMaxNumber(int[] arrayRandomNumber) {
        int maxNumber=arrayRandomNumber[0];
        for (int i = 0; i < arrayRandomNumber.length; i++) {
            if (arrayRandomNumber[i] > maxNumber) {
                maxNumber = arrayRandomNumber[i];
            }
        }
        System.out.println(maxNumber);
    }
}

