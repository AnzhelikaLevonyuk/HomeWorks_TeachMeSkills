package HomeWork_3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Part2 {
    public static void main(String[] args) {

        System.out.println("----- Сhessboard -------");
        сhess();
        //chess2();

        System.out.println("\n----- Sum of All Elements -------");
        sumOfAllElements();

        System.out.println("\n----- Diagonals -------");
        diagonal();

        System.out.println("\n----- Sort elements in the rows -------");
        sort();

    }


    // Создать двухмерный массив String'ов 8х8. С помощью циклов задать элементам
    // значения B(Black) или W(White).
    public static void сhess() {

        String [][] arr = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 0 && j % 2 == 0) || (i % 2 == 1 && j % 2 == 1))
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
            //System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void chess2() {

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

        for (int i = 0 ; i < arr.length ; i++)
        {
            int row = i;
            int col = 0;

            while (row >= 0 && col < arr[i].length)
            {
                System.out.print(arr[row][col] + " ");
                col++;
                row--;
            }
            System.out.println();
        }

        for (int i = 1 ; i < arr[0].length ; i++)
        {
            int row = arr.length-1;
            int col = i;

            while (row >= 0 && col < arr[i].length)
            {
                System.out.print(arr[row][col] + " ");
                col++;
                row--;
            }
            System.out.println();
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







