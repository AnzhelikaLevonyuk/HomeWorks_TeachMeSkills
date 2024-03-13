package homeWork_4_Dop;

public class Test {
    public static void main(String[] args) {
        Comp comp1 = new Comp(1200,"HP");
        Comp comp2 = new Comp(1500, "Acer", new HDD ("toshiba",22, "внешний"), new RAM("ddddd", 123));

        comp1.getInfoAboutComp();
        comp2.getInfoAboutComp();
    }
}
