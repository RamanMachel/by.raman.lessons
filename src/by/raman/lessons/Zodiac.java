package by.raman.lessons;


import java.util.Scanner;

public class Zodiac {
    public static void main(String[] args) {
        System.out.print("Введите сумму в Росийских рублях");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double y = 73.52;
        double x = n/y;
        double z = 29.33;
        double w = n/z;
        System.out.println(x + "  $" + "   --->   "+w + "  BYN");
       }
    }

