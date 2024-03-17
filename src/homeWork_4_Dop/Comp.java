package homeWork_4_Dop;

public class Comp {
    public int price;
    public String model;
    public HDD hdd;
    public RAM ram;

    public Comp(int price, String model)
    {
        this.price = price;
        this.model = model;
        this.hdd = new HDD();
        this.ram = new RAM();

    }

    public Comp(int price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public void getInfoAboutComp()
    {
        System.out.println(" ");
        System.out.println("Model: " + model);
        this.hdd.getInfoAboutHdd();
        this.ram.getInfoAboutRam();
        System.out.println("Price: " + price);

    }
}
