package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        System.out.println("----- Сhessboard -------");
        chess();


        System.out.println("\n----- Sum of All Elements -------");
        sumOfAllElements();

        System.out.println("\n----- Diagonals -------");
        diagonal();

        System.out.println(" ");
        System.out.println("\n----- Sort elements in the rows -------");
        sort();

    }


    // Создать двухмерный массив String'ов 8х8. С помощью циклов задать элементам
    // значения B(Black) или W(White).

    public static void chess() {

        String [][] arr = new String[8][8];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i + j) % 2 == 0 )
                {
                    arr[i][j] = "W";
                }
                else
                {
                    arr[i][j] = "B";
                }

                System.out.print(arr[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }

    // Выведите на консоль сумму всех элементов массива.
    public static void sumOfAllElements() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива (кол-во строк): ");
        int n = sc.nextInt();

        System.out.print("Введите размерность массива (кол-во элементов в каждой строке): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        Random rand = new Random();
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = rand.nextInt(10);
                count += arr[i][j];
            }
            System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println("Сумма всех элементов массива: " + (count));
    }

    // Выведите на консоль диагонали массива.
    public static void diagonal(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива (кол-во строк): ");
        int n = sc.nextInt();

        System.out.print("Введите размерность массива (кол-во элементов в каждой строке): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        Random rand = new Random();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = rand.nextInt(10);
            }
            System.out.println(Arrays.toString(arr[i]));
        }

       if (n == m)
       {
           System.out.print("Главная диагональ: ");
           for (int i = 0; i< arr.length; i ++)
           {
               System.out.print(arr[i][i] + " ");

           }

           System.out.print("\nПобочная диагональ: ");

           for (int i = 0; i< arr.length; i ++)
           {
               System.out.print(arr[i][arr.length - i - 1] + " ");
           }
       }
       else if (n > m)
       {
           System.out.print("Главная диагональ: ");
           for (int i = 0; i < m; i ++)
           {
               System.out.print(arr[i][i] + " ");

           }

           System.out.print("\nПобочная диагональ: ");
           for (int i = 0, j = 0 ; i < m; i ++)
           {
               System.out.print(arr[i][m - j - 1] + " ");
               j++;
           }
       }
       else
       {
           System.out.print("Главная диагональ: ");
           for (int i = 0; i < n; i ++)
           {
               System.out.print(arr[i][i] + " ");

           }

           System.out.print("\nПобочная диагональ: ");
           for (int i = 0, j = 0 ; i < n; i ++)
           {
               System.out.print(arr[i][n - j - 1] + " ");
               j++;
           }
       }


    }

   // Отсортируйте элементы в строках двумерного массива по возрастанию.
    public static void sort() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размерность массива (кол-во строк): ");
        int n = sc.nextInt();

        System.out.print("Введите размерность массива (кол-во элементов в каждой строке): ");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];

        Random rand = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
            {
                arr[i][j] = rand.nextInt(10);
                Arrays.sort(arr[i]);
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}







