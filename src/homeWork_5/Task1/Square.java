package homeWork_5.Task1;

import homeWork_5.Task1.Rectangle;

public class Square extends Rectangle {


    public Square (double sideA)
    {
        super(sideA, sideA);
    }

    @Override
    public double getArea()
    {
        double area = sideA * sideA ;
        return area;
    }

    @Override
    public double getPerimetr()
    {
        double perimetr = 4 * sideA ;
        System.out.println("Периметр квадрата = " + perimetr);
        return perimetr;
    }

}
