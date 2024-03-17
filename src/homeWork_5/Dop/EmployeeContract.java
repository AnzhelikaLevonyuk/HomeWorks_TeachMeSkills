package homeWork_5.Dop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeContract extends Document
{
    public String name;
    public Date endDateOfContract;


    public EmployeeContract()
    {

    }
    public EmployeeContract(int docNumber, Date date, String name, Date endDateOfContract)
    {
        super(docNumber, date);
        this.name = name;
        this.endDateOfContract = endDateOfContract;
    }

    @Override
    public void fillingOutDocument()
    {
        System.out.println("-----Контракт с сотрудником-----");
        commonFields();
        Scanner sc = new Scanner(System.in);
        System.out.print("Имя сотрудника: ");
        name = sc.next();
        System.out.print("Дата окончания контракта: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try
        {
            endDateOfContract = sdf.parse(sc.next());
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Контракт с сотрудником:" +
                "\n[Номер документа: " + docNumber +
                ", Дата документа: " + sdf.format(date) +
                ", Имя сотрудника: " + name +
                ", Дата окончания контракта: " + sdf.format(endDateOfContract) + "]";
    }
}
