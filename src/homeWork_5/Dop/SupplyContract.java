package homeWork_5.Dop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class SupplyContract extends Document
{
    public String type;
    public int count;


    public SupplyContract()
    {

    }

    public SupplyContract (int docNumber, String type, int count,  Date date )
    {
        super(docNumber, date);
        this.type = type;
        this.count = count;
    }
    @Override
    public void fillingOutDocument()
    {
        System.out.println("-----Контракт на поставку товаров-----");
        commonFields();
        Scanner sc = new Scanner(System.in);
        System.out.print("Тип товаров: ");
        type = sc.next();
        System.out.print("Количество товаров: ");
        count = sc.nextInt();
    }

    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Контракт на поставку товаров:" +
                "\n[Номер документа: " + docNumber +
                ", Дата документа: " + sdf.format(date) +
                ", Тип товаров: " + type +
                ", Количество товаров: " + count + "]";
    }
}
