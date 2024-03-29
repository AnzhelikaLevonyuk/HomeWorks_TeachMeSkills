package HomeWork_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность: ");
        int number = sc.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++)
        {
            System.out.println("Введите " + (i + 1) + " -ое число: ");
            list.add(sc.nextInt());
        }

       // First solution
//        HashSet<Integer> set = new HashSet<>(list);
//        list.clear();
//        list.addAll(set);


       // Second solution
        for (int i = 0; i < list.size(); i++)
        {
            int currentItem = list.get(i);

            for (int j = i + 1; j < list.size(); j++)
            {
                if (currentItem == list.get(j))
                {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
    }
}
