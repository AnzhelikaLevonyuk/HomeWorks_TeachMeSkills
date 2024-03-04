package HomeWork_2;

import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {

        System.out.println("----- First task -------");
        getOddNumbers();
        System.out.print("\n");

        System.out.println("\n----- Second task -------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите любое целое положительное число: ");
        int a = sc.nextInt();
        System.out.println("Сумма чисел от 1 до " + a + " = "+ getSum(a));

        System.out.println("\n----- Third task -------");
        getPlus();
        System.out.print("\n");

        System.out.println("\n----- Fourth task -------");
        getSquareOfNumbers();

    }

    // 1. При помощи цикла for вывести в консоль нечетные числа от 1 до 99.
    public static void getOddNumbers (){
        for (int i = 1; i < 100; i++){
            if (i % 2 == 1){
                System.out.print( i + " " );
            }
        }
    }

    // 2. Напишите программу, где пользователь вводит любое целоеположительное число.
    // А программа суммирует все числа от 1 до введенного пользователем числа.
    public static int getSum(int a) {
        int sum = 0;
        for (int i = 1; i <= a; i++)
        {
            sum += i;
        }
        return sum;
    }

    // 3. Необходимо, чтоб программа выводила в консоль вот такую последовательность: 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
    // В решении используйте цикл while.
    public static void getPlus(){
        int i = 0;
        while (i < 98){
            i = i + 7;
            System.out.print(i + " ") ;
        }
    }

    // 4. Составьте программу, выводящую в консоль квадраты чисел от 10 до 20 включительно.
    public static void getSquareOfNumbers (){
        for (int i = 10; i <= 20; i++){
            int b = i * i;
            System.out.print(b + " " );
        }
    }
}
