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
        return sideA * sideA;
    }

    @Override
    public double getPerimetr()
    {
        return 4 * sideA;
    }

}
