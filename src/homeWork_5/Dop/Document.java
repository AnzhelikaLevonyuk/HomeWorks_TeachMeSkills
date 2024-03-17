package homeWork_5.Dop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Document {

    public int docNumber;
    public Date date ;

    public Document()
    {

    }

    public Document(int docNumber, Date date)
    {
        this.docNumber = docNumber;
        this.date = date;
    }
    public void commonFields()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Номер документа: ");
        docNumber = sc.nextInt();
        System.out.print("Дата документа: ");
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        try
        {
            date = sdf.parse(sc.next());
        }
        catch (ParseException e)
        {
            throw new RuntimeException(e);
        }
    }
    public abstract void fillingOutDocument();

}

