package homeWork_5.Task1;

import java.util.Scanner;

public class Circle extends Shape
{
    protected double radius;

    public Circle(double radius)
    {
       this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * radius * radius;
    }


    @Override
    public double getPerimetr()
    {
        return 2 * Math.PI * radius;
    }

}
