package HomeWork_8;

import java.util.*;

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

        Set<Integer> list2 = new HashSet<>();

        for (int i = 0; i < list.size(); i++)
        {
            int currentItem = list.get(i);

            for (int j = i + 1; j < list.size(); j++)
            {
                if (currentItem == list.get(j))
                {
                   list2.add(currentItem);
                }
            }
        }
//        list.removeIf(value -> list2.contains(value));
//        System.out.println(list);

        for (int currentValue : list2)
        {
            for (int j = 0; j < list.size(); j++)
            {
                if (currentValue == list.get(j))
                {
                    list.remove(j);
                    j--;
                }
            }
        }
        System.out.println(list);
        }
    }
