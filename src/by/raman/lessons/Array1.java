package by.raman.lessons;
/*
1. Напишите программу, которая печатает массив сначала в обычном порядке, затем в обратном.
 */

public class Array1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 7, 8};

        disassemble(array);

        disassembleDesc(array);
    }

    public static void disassemble(int[] array) {
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
        System.out.println("  ");
        System.out.print("******");
        System.out.println("  ");
    }


    public static void disassembleDesc(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
        }
    }
}
