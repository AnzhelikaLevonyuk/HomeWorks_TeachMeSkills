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
        return sideA * sideB;
    }

    @Override
    public double getPerimetr()
    {
        return (sideA + sideB) * 2;
    }
}
