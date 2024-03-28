package HomeWork_7;

import java.util.Scanner;

public class ThirdTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int num = getNum();

        try
        {
            if (isPalindrome(arr[num - 1]))
            {
                System.out.println("Слово " + arr[num - 1] + " является полиндром");
            }
            else
            {
                System.out.println("Слово " + arr[num - 1] + " не является полиндром");
            }
        }
        catch(Exception ex)
        {
            System.out.println("!Error!\nЧисло должно быть больше 0 и меньше " + arr.length);
        }
    }

    public static boolean isPalindrome(String word)
    {
        StringBuilder str = new StringBuilder(word);
        String newWord = String.valueOf(str.reverse());
        return word.equals(newWord);
    }

    public static int getNum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер слова для проверки на полиндром: ");
        try
        {
            return sc.nextInt();
        }
        catch (Exception ex)
        {
            System.out.println("!Введите ЧИСЛО!");
            return getNum();
        }
    }
}

