package HomeWork_1;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {

        //1. Написать программу для вывода на экран результата деления 2 чисел.
        // 2. Написать программу для вывода на экран результата деления остатка от деления 2 чисел.
        double a = 5;
        double b = 2;

        System.out.println("-------- Task 1 ---------");
        System.out.println("Результат деления двух чисел : " + (a / b));
        System.out.println("Pезультат деления остатка от деления 2 чисел: " + (a % b));

        System.out.println("\n-------- Task 2 ---------");
        getProizv();

        System.out.println("\n-------- Task 3 ---------");
        getResSravn();


    }

    // 3. Написать программу для вывода на экран результата умножения 3 чисел.
    //Все 3 числа должны вводиться пользователем из консоли.
    static void getProizv() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc.nextInt();

        System.out.print("Введите 2-ое число: ");
        int b = sc.nextInt();

        System.out.print("Введите 3-ее число: ");
        int c = sc.nextInt();

        System.out.println("Произведение ваших чисел: " + (a * b * c));
    }

    // 4. Из консоли пользователь вводит2 числа.
    // Написать программу, которая выводит на экран результат сравнения 2 чисел (trueили false).

    static void getResSravn() {

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите 1-ое число: ");
        int a = sc1.nextInt();

        System.out.print("Введите 2-ое число: ");
        int b = sc1.nextInt();

        System.out.println("Результат сравнения: " + (a == b));

    }

}