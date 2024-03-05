package HomeWork_2;

import java.util.Scanner;

public class Dop {
    public static void main(String[] args) {

        System.out.println("----- Fibonacchi -------");
        fibonacci();
        System.out.println( );

        System.out.println("\n----- Summ of Vklad wit % -------");
        vklad();

        System.out.println("\n----- Multiplication table -------");
        tabl();
    }

    // 1. Выведите в консоль первые N членов последовательности Фибоначчи
    // (где N- количество членов, вводимое пользователем из консоли).
    public static void fibonacci() {

        Scanner sc = new Scanner(System.in);

        int n1 = 0;
        int n2 = 1;
        int sum;

        System.out.print("Введите любое целое положительное число: ");
        int count = sc.nextInt();

        System.out.print("Последовательность Фибоначчи: " + n1 + " " + n2 + " ");

        for (int i = 1; i <= count; i ++)
        {
            sum = n1 + n2;
            System.out.print(sum + " " );
            n1 = n2;
            n2 = sum;
        }
    }


    //    2. За каждый месяц банк начисляет к сумме вклада 7% от суммы.
//    Напишите программу, которая вычисляет конечную сумму вклада
//    с учетом начисления процентов за каждый месяц.
//    Сумму вклада и количество месяцев пользователь вводит с консоли.
//
//    Для вычисления суммы с учетом процентов используйте цикл for.
//    Пусть сумма вклада будет представлять тип float.
    public static void vklad() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите сумму вклада: " );
        float sum = sc.nextInt();

        System.out.print("Введите кол-во месяцев: ");
        int countOfMonth = sc.nextInt();

        System.out.print("Введите ваш %: ");
        double percent = sc.nextInt();

        float procent = (float) (sum * (percent / 100));


        for (int i = 1; i <= countOfMonth; i ++)
        {
            sum += procent;
        }

        System.out.println("Сумма с учетом процентов за каждый месяц: " + sum);
    }

    // 3. Напишите программу, которая выводит на консоль таблицу умножения.
    public static void tabl() {

        for (int i = 1; i < 10; i++)
        {
            for (int j = 1; j < 10; j++)
            {
                int itog = i * j;

                System.out.println (i + " * " + j + " = " + itog + " ");

                // вывод в виде таблицы
                // System.out.print ( itog + "\t");
            }
            System.out.println (" ");
        }
    }

}

