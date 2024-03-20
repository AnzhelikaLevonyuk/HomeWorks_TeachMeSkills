package homeWork_5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);


        System.out.print("\nВведите радиус круга: ");
        double radius2 = sc.nextDouble();
        Circle circle2 = new Circle(radius2);


        System.out.print("\nВведите 1-ую сторону прямоугольника: ");
        double sideA = sc.nextDouble();
        System.out.print("Введите 2-ую сторону прямоугольника: ");
        double sideB = sc.nextDouble();
        Rectangle rectangle = new Rectangle(sideA, sideB);



        System.out.print("\nВведите сторону квадрата: ");
        double sideAA = sc.nextDouble();
        Square square = new Square(sideAA);


        System.out.print("\nВведите сторону квадрата: ");
        double sideAA2 = sc.nextDouble();
        Square square2 = new Square(sideAA2);


        double sum = 0;
        Shape[] arr = { circle, circle2, rectangle, square, square2};

        for (Shape shape : arr)
        {
            sum += shape.getPerimetr();
        }

        System.out.println("\nСумма периметров всех фигур = " + sum);

    }
}
