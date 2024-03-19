package homeWork_5.Dop;

public class Registr {

    public static Document[] arr = new Document[10];
    private static int index = 0;

    public static void saveDocument (Document d)
    {
        arr[index] = d;
        index += 1;
    }

    public static void getInfoAboutDocument(int index)
    {
        System.out.println(arr[index]);
    }
}
