package by.raman.lessons;

public class TaskOne {
    public static void main(String[] args) {
        int x = 33;
        int y = 15;
        int z = 7;
        int max = 0;
        if (x > y && x > z) {
            max = x;
        } else if (y > x && y > z) {
            max = y;
        }
        else if (z>y&&z>x){
            max = z;
        }
        else {
            System.out.println("Error");
        }
        System.out.println(max);
    }
}
