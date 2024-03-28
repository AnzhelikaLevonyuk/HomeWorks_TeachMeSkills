package HomeWork_7;

import java.util.Scanner;

public class SecondTask {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        String result = arr[0];

        for (String minimalCharacters: arr) {
            if (getUniqueCharAmount(result) > getUniqueCharAmount(minimalCharacters)) {
                result = minimalCharacters;
            }
        }
        System.out.println(result);
    }

    public static int getUniqueCharAmount(String word)
    {
        int count = 0;
        String[] arr = word.split("");
        for(String ch : arr)
        {
            if (word.contains(ch))
            {
                count++;
                word = word.replace(ch, "");
            }
        }
        return count;
    }
}
