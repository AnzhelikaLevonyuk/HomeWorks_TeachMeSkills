package HomeWork_7;

import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i += 2)
        {
            sb.insert(i + 1, sb.charAt(i));
        }

        System.out.println(sb);
    }
}
