//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Уважаемый наставник представляю Вашему вниманию домашнее задание " + "к уроку за " +
                "18 февраля 2026г. ");
        System.out.println();

        System.out.println("Задача №1 ");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №2 ");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №3 ");
        for (int i = 0; i < 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №4 ");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №5 ");
        for (int i = 1904; i < 2097; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();
        System.out.println("Задача №6 ");
        for (int i = 7; i < 99; i = i + 7) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №7 ");
        for (int i = 1; i < 513; i = i * 2) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Задача №8 ");
        int cash = 0;
        for (int i = 1; i < 12; i++) {
            cash = cash + 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + cash + " рублей");
        }
        System.out.println();
        System.out.println("Задача №9 ");
        cash = 0;
        for (int i = 1; i < 12; i++) {
            cash = cash + 29000 + cash / 100;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + cash + " рублей");
        }
        System.out.println();
        System.out.println("Задача №10 ");
        int number = 2;
        int result = 0;
        for (int i = 1; i < 11; i++) {
            result = number * i;
            System.out.println(number + "*" + i + "=" + result);
        }
        System.out.println();
        System.out.println("Задача №10 (представляю второй вариант решения.(");
        result = 0;
        for (int i = 1; i < 11; i = i + 1) {
            result = i * 2;
            System.out.println("2*" + i + "=" + result);
        }
    }
}