package homeWork_5.Dop;

public class Main {
    public static void main(String[] args) {

        Document a = new SupplyContract();
        a.fillingOutDocument();

        Document b = new EmployeeContract();
        b.fillingOutDocument();

        Document c = new FinancialInvoice();
        c.fillingOutDocument();

        Registr.saveDocument(a);
        Registr.saveDocument(b);
        Registr.saveDocument(c);

        Registr.getInfoAboutDocument(a);
        Registr.getInfoAboutDocument(b);
        Registr.getInfoAboutDocument(c);

        //System.out.println(Arrays.toString(Registr.arr));

    }
}
