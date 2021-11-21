package by.raman.lessons;

public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 5, 8, 3, 1, 5};
        deleteElementArray(array);
    }

    public static void deleteElementArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int cursor = array[i];
            for (int j = 1; j < array.length; j++) {
                if (array[j] == cursor) {
                    array[j] = 0;
                }
            }
            System.out.println(cursor);
        }
    }
}


