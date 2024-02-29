package HomeWork_2;

import java.util.Scanner;

public class FirstPart {
    private static Object Switch;

    public static void main(String[] args) {

        System.out.println("\n-----Switch- case-------");
        FirstPart.first();

        System.out.println("\n----- If-else-if -------");
        FirstPart.second();

        System.out.println("\n----- Third task -------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        System.out.println(FirstPart.third(sc.nextInt()));

        System.out.println("\n----- Fourth task -------");
        System.out.print("Температура на улице: ");
        System.out.println(FirstPart.fourth(sc.nextInt()));

        System.out.println("\n----- Fifth task -------");
        FirstPart.fifth();


    }

    // 1. Написать программу для вывода в консоль названия поры года по номеру месяца.
    //При решении используйте оператор switch-case.
    public static void first(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        String season;
        switch (month) {

            case 1:
            case 2:
            case 12: season = "Winter";
                break;

            case 3:
            case 4:
            case 5:  season = "Spring";
                break;

            case 6:
            case 7:
            case 8:  season = "Summer";
                break;

            case 9:
            case 10:
            case 11: season = "Autumn";
                break;

            default: season = "Value should be from 1 to 12 including";
                break;
        }

        System.out.println("It's " + season);
    }


    // 2. При решении используйте оператор if-else-if.
    public static void second(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        String season;
        if ( month == 1 || month == 2 || month == 12){
            season = "Winter";
        } else if
        (month == 3 || month == 4 || month == 5)
        {
            season = "Spring";
        }
        else if
        (month == 6 || month == 7 || month == 8)
        {
            season = "Summer";
        }
        else if
        (month == 9 || month == 10 || month == 11)
        {
            season = "Autumn";
        }
        else {
            season = "Value should be from 1 to 12 including";
        }

        System.out.println("It's " + season);

    }

    // 3. Напишите программу, которая будет принимать на вход (ввод из консоли) число
    // и в консоль будет выводить сообщение четное число или нет.
    public static String third (int a){
        if (a % 2 == 0){
            return "Ваше число четное";
        } else {
            return "Ваше число нечетное";
        }
    }

    // 4. Для введенного числа t (температура на улице) вывести:
    public static String fourth (int degree){
        // Если t>–5, то вывести «Тепло».
        if (degree > -5) {
            return "Тепло";
        }
        // Если –5>= t > –20, то вывести «Нормально».
        else if (degree <= -5 && degree > -20 ) {
            return "Нормально";
        }
        // Если –20>= t, то вывести «Холодно».
        else if (degree <= -20) {
            return "Холодно";
        }
        else {
            return "Не знаю";
        }
    }

    // 5. По введенному из консоли номеру определить цвет радуги (1 – красный, 4 – зеленый и т. д.)
    public static void fifth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер цвета в радуге: ");
        int number = sc.nextInt();
        String color;

        switch (number) {

            case 1: color = "Красный";
                break;

            case 2: color = "Оранжевый";
                break;

            case 3: color = "Желтый";
                break;

            case 4: color = "Зеленый";
                break;

            case 5: color = "Голубой";
                break;

            case 6: color = "Синий";
                break;

            case 7: color = "Фиолетовый";
                break;

            default: color = "Значение должно быть от 1 до 7 включительно";
                break;
        }

        System.out.println("Это " + color);
    }

}

