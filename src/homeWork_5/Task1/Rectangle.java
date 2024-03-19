package homeWork_5.Task1;

public class Rectangle extends Shape
{
    protected double sideA;
    protected double sideB;

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
