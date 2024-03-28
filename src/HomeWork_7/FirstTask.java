package HomeWork_7;

import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");
        String shortWord = arr[0];
        String longWord = arr[0];

        for( int i = 1; i < arr.length; i++)
        {
            if (longWord.length() <= arr[i].length())
            {
                longWord = arr[i];
            }

            if (shortWord.length() >= arr[i].length())
            {
                shortWord = arr[i];
            }
        }
        System.out.print("Самое длинное слово: " + longWord);
        System.out.println(" (" + longWord.length() + " букв)");
        System.out.print("Самое короткое слово: " + shortWord);
        System.out.println(" (" + shortWord.length() + " букв)");
    }
}
