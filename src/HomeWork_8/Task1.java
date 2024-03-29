package HomeWork_8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int sum = 0;

        while (scan.hasNextInt())
        {
            int a = scan.nextInt();
            if (a < 0)
            {
                break;
            }
            else
            {
                sum += a;
            }

            while (!scan.hasNextInt())
            {
                scan.next();
            }
        }
        System.out.println("Сумма ваших чисел = " + sum);
    }
}

