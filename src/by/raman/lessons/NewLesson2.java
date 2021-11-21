package by.raman.lessons;

public class NewLesson2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6, 8, 9, 10, 13, 15, 17, 18, 22, 33, 34, 37, 49};
        int lost = 34;
        int result = binarySearch(array, lost);
        System.out.println("Искомое числов - " + result + " элемент массива");
    }

    public static int binarySearch(int[] array, int lost) {
        int startSearch = 0;
        int endSearch = array.length - 1;
        while (startSearch < endSearch) {
            int rangeSearch = (startSearch + endSearch) / 2;
            if (lost > array[rangeSearch]) {
                startSearch = rangeSearch;
            } else if (lost < array[rangeSearch]) {
                endSearch = rangeSearch;
            } else {
                return rangeSearch;
            }
        }
        return -1;
    }
}



