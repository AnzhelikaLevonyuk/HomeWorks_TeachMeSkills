package homeWork_5.Dop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class FinancialInvoice extends Document
{
    public double sum;
    public int departmentCode;

    public FinancialInvoice()
    {

    }
    public FinancialInvoice(int docNumber, Date date, double sum, int departmentCode)
    {
        super(docNumber, date);
        this.sum = sum;
        this.departmentCode = departmentCode;
    }

    @Override
    public void fillingOutDocument()
    {
        System.out.println("-----Финансовая накладная-----");
        commonFields();
        Scanner sc = new Scanner(System.in);
        System.out.print("Код департамента: ");
        departmentCode = sc.nextInt();
        System.out.print("Итоговая сумма за месяц: ");
        sum = sc.nextDouble();
    }

    @Override
    public String toString()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        return "Финансовая накладная:" +
                "\n[Номер документа: " + docNumber +
                ", Дата документа: " + sdf.format(date) +
                ", Код департамента: " + departmentCode +
                ", Итоговая сумма за месяц: " + sum + "]";
    }
}
