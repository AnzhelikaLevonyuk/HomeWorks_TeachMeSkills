package homeWork_5.Dop;

public class Registr {

    public static Document[] arr = new Document[10];

    public static void saveDocument (Document d)
    {

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == null)
            {
                arr[i] = d;
                break;
            }
        }
    }

    public static void getInfoAboutDocument(Document d)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if(d == arr[i])
            {
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
