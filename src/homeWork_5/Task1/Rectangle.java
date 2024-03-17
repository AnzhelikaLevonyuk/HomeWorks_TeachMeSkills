package homeWork_5.Task1;

public class Rectangle extends Shape
{
    public double sideA;
    public double sideB;

    public Rectangle (double sideA, double sideB)
    {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea()
    {
        double area = sideA * sideB;
        return area;
    }

    @Override
    public double getPerimetr()
    {
        double perimetr = (sideA + sideB) * 2;
        System.out.println("Периметр прямоугольника = " + perimetr);
        return perimetr;
    }
}
