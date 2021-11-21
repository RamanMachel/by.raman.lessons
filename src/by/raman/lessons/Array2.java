package by.raman.lessons;
/*
Определить сумму элементов целочисленного массива
 */
public class Array2 {
    public static void main(String[] args) {
        int [] array = {10,8,6,4,6};

        int total = calculate(array);

        print(total);
    }

    public static int calculate(int [] array){
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public  static void print(int total){
        System.out.println(total);
    }

}
