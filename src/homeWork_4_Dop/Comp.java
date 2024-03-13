package homeWork_4_Dop;

public class Comp {
    int price;
    String model;
    HDD hdd;
    RAM ram;

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
