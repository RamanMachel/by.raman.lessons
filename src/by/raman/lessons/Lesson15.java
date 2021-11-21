package by.raman.lessons;

import java.util.Scanner;

public class Lesson15 {
    public static void main(String[] args) {
        System.out.print("Замученный дорогой и выбевшись из сил, вы попросили ночлег у Лесника");
        System.out.println("  ");
        System.out.print("Как тебя зовут,Путник? - хриплым голосом,спросил Лесник");
        System.out.println("  ");
        System.out.println("---Введите свое Имя---");
        Scanner sc = new Scanner(System.in);
        String nameHero = sc.nextLine();
        System.out.print("Хм...ну что ж," + nameHero + ",будь как дома.Странно улыбнувшись, сказал Лесник");
        System.out.print(".Че ж ты стал," + nameHero + ",проходи за стол,что есть будешь?");
        System.out.println("  ");
        System.out.println("---Сделайте выбор---");
        System.out.println("");
        System.out.println("-1.Мясо-");
        System.out.println("");
        System.out.println("-2.Квас-");
        System.out.println("");
        System.out.println("-3.А есть салатик Цезарь?-");
        Scanner sc2 = new Scanner(System.in);
        int choiceOne = sc.nextInt();
        if (choiceOne == 1) {
            System.out.println("Правильно," + nameHero + ",Мясо это выбор настоящих мужчин, к тем более Мясо у меня очень хорошее:свежатина и такое мягкое...хм...пальчики оближешь!");
        } else if (choiceOne == 2) {
            System.out.println("И квас у меня есть, но что ж пить квас без Мяса, это тебя," + nameHero + ",не уважать,к тем более Мясо у меня очень хорошее:свежатина и такое мягкое...хм...пальчики оближешь!");
        } else if (choiceOne == 3) {
            System.out.println("Чего ??? Так ты из этих? Гадюку, в дом я впустил ?");
            System.out.println("Лесник достал ружье...направил на Вас дуло");
            System.out.println("Надеюсь хоть Мясо нормальное будет,для моих друзей");
            System.out.println("-*-*-GameOver-*-*-");
        }
        System.out.println("Так как ты попал в эти края, здесь редко люд бывает");
        System.out.println("  ");
        System.out.println("---Сделайте выбор---");
        System.out.println("");
        System.out.println("1.Путешествую много,интересное собираю,пишу в журнале");
        System.out.println("");
        System.out.println("2.Заблудился я, пока искал путь,незаметил как ночь настала");
        System.out.println("");
        System.out.println("3.Тебя старик искал, знаю все про тебя, милиция уже выехала!");
        Scanner sc3 = new Scanner(System.in);
        int choiceTwo = sc.nextInt();
    }
}
