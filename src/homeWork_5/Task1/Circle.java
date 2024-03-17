package homeWork_5.Task1;

import java.util.Scanner;

public class Circle extends Shape
{
    public double radius;
    public final double PI = 3.14;

    public Circle()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите радиус круга: ");
        this.radius = sc.nextDouble();
    }

    @Override
    public double getArea()
    {
        double area = PI * radius * radius ;
        return area;
    }


    @Override
    public double getPerimetr()
    {
        double perimetr = 2 * PI * radius ;
        System.out.println("Периметр круга = " + perimetr);
        return perimetr;
    }

}
