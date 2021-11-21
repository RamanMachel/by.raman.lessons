package by.raman.lessons;

import java.util.Scanner;

public class Quest1 {public static void main(String[] args) {
    System.out.print("Кто сильнее:" + "   1)Гришка" + "   2)Пушка"+ "   3)Нуки");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    NextStep(n);
    if(n==1){
        System.out.println("Это правильный ответ ! - У Гришки велика и могуча шишка!!!");
    }
    else if(n==2){
        System.out.println("Это правильный ответ! - Пушка не играет в игрушки, а ломает хребты!!!");
    }
    else if(n==3){
        System.out.println("Это правильный ответ! - У Нуки, руки не для скуки: могут боль причинить, могут на Бабку подрочить!");
    }
    else {
        System.out.println("Ты дурак!? У тебя был выбор 1, 2 и 3 -  выбери своего героя");
    }
}
public static void NextStep(int x){
    System.out.print("У кого писюн больше:" + "   1)Гришка" + "   2)Пушка"+ "   3)Нуки");
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();

}
}
