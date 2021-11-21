package by.raman.lessons;

public class NewLesson1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 8, 10, 13, 15, 18, 19, 22};
        for (int i = 0; i < array.length; i++) {
            int x = 15;
            if (x == array[i]) {
                System.out.println("Выбранное число" + " " + i + "" + " элемент массива");
            }
        }
    }
}
