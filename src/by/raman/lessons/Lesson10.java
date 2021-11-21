package by.raman.lessons;
/*
1 2 4 8 16 32 64 128 256 512
 */
public class Lesson10 {
    public static void main(String[] args) {
        int x = 1;
        while (x<=512) {
            System.out.print(x + "   ");
            x*=2;
        }
    }
}
