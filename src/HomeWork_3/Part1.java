package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Part1 {
    public static void main(String[] args) {

        System.out.println("----- Find Element -------");
        findAnElement();

        System.out.println("\n----- Remove Element -------");
        removeAnElement();

        System.out.println("\n----- Get Max,Min,Avg -------");
        getMaxMinAvg();

        System.out.println("\n----- Avg in Two Arrays -------");
        avgInTwoArrays();

        System.out.println("\n----- Array with Even Numbers -------");
        arrayWithEvenNumbers();

        System.out.println("----- Array with Null -------");
        arrayWithNull();



    }


    public static int[] createRandomArr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        Random rand = new Random();
        for (int i = 0; i < length; i++)
        {
            arr[i] = rand.nextInt(10);
        }

        return arr;
    }


   // программа, которая выводит сообщение о том, входит ли заданное число в массив или нет.
    public static void findAnElement()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = createRandomArr();


        System.out.print("Введите ваше число: ");
        int number = sc.nextInt();
        int count = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (number == arr[i])
            {
                count++;
            }
        }
        if (count > 0)
        {
            System.out.println("Ваше число входит в массив " + count + " раз");
        }
        else
        {
            System.out.println("Ваше число не входит в массив");
        }

        System.out.println(Arrays.toString(arr));
    }


    // Удалите все вхождения заданного числа из массива.
    // В результате должен быть новый массив без указанного числа.
    public static void removeAnElement()
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = createRandomArr();

        System.out.println(Arrays.toString(arr));

        System.out.print("Введите ваше число: ");
        int number = sc.nextInt();

        int count = 0;
        int count2 = 0;

        for (int i = 0; i < arr.length; i++)
        {
            if (!(number == arr[i]))
            {
                count++;
            }
            else
            {
                count2++;
            }
        }
       if (count2 == 0){
           System.out.println("Ваше число не входит в массив");
       }

        int[] newArr = new int[count];

        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (!(number == arr[i]))
            {
                newArr[j] = arr[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArr));
    }


    // Создайте и заполните массив случайным числами и выведете
    // максимальное, минимальное и среднее значение.
    public static void getMaxMinAvg() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
        {
            arr[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(arr));

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        double sum = 0;

        for (int i = 0; i < arr.length; i++)
        {

            if (arr[i] < min)
            {
                min = arr[i];
            }

            if (arr[i] > max)
            {
                max = arr[i];
            }

            sum += arr[i];
        }

        System.out.println("Минимальное значение массива: " + min);
        System.out.println("Максимальное значение массива: " + max);
        System.out.println("Среднее значение массива: " + sum /arr.length);

    }


    // Создайте 2 массива из 5 чисел.
    // Посчитайте среднее арифметическое элементов каждого массива и выведите на консоль,
    // для какого из массивов это значение оказалось больше
    // (либо выведите, что их средние арифметические равны).

    public static void avgInTwoArrays() {

        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        double sum1 = 0;
        double sum2 = 0;

        Random rand = new Random();

        for (int i = 0; i < 5; i++)
        {
            arr1[i] = rand.nextInt(10);
            arr2[i] = rand.nextInt(10);
        }

        for (int i = 0; i < arr1.length; i++)
        {
             sum1 += arr1[i];
        }

        for (int i = 0; i < arr2.length; i++)
        {
            sum2 += arr2[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        double avg1 = sum1/arr1.length;
        double avg2 = sum2/arr2.length;

        if (avg1 > avg2)
        {
            System.out.println("Среднее арифметическое 1-ого массива больше: " + avg1 + " > " + avg2);
        }
        else if (avg1 < avg2)
        {
            System.out.println("Среднее арифметическое 2-ого массива больше: " + avg2 + " > " + avg1);
        }
        else
        {
            System.out.println("Cредние арифметические равны: " + avg1 + " = " + avg2);
        }
    }


    // Размер массива может быть больше 5 и меньше или равно 10.
    // Создайте второй массив только из чётных элементов первого массива,
    // если они там есть, и вывести его на экран.
    public static void arrayWithEvenNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива: ");
        int length = sc.nextInt();

        while (length < 5 || length > 10) {

            System.out.print("\nНеверная размернось массива!!! \nВведите число от 5 до 10: ");
            length = sc.nextInt();
        }

        int[] arr = new int[length];
        Random rand = new Random();

        int lenghtForNewArray = 0;

        for (int i = 0; i < length; i++) {
            arr[i] = rand.nextInt(10);
            if (arr[i] % 2 == 0)
            {
                lenghtForNewArray++;
            }
        }

        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[lenghtForNewArray];

        for (int i = 0, j = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                arr2[j] = arr[i];
                j++;
            }
        }
        System.out.println("Новый массив из четных чисел первого массива: " + "\n"+ Arrays.toString(arr2));

    }


    // Замените каждый элемент с нечётным индексом на ноль.
    public static void arrayWithNull() {
        Scanner sc = new Scanner(System.in);
        int[] arr = createRandomArr();

        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i ++)
        {
            if (i % 2 == 1)
            {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
