package HomeWork_8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args)
    {
        int sum = 0;
        while (true)
        {
            int a = getNum();
            if (a < 0)
            {
                break;
            }
            else
            {
                sum += a;
            }
        }
        System.out.println("Сумма ваших чисел = " + sum);
    }
    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        try
        {
            return sc.nextInt();
        }
        catch (Exception ex)
        {
            return getNum();
        }
    }
}

