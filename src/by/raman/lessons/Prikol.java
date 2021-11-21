package by.raman.lessons;

public class Prikol {
    public static void main(String[] args) {
        int x = 10;
        int y = 10_000_000;
        main1(x, y);
    }

    public static void main1(int x, int y) {
        int u = y;
        while (x > 0) {
            x--;
            int o = u / 1000 * 6;
            u += o;
            System.out.println(u);
        }
    }
}
