package homeWork_4_Dop;

public class HDD {
    String name;
    double volume;
    String type;

    public HDD()
    {
        name = "не указано";
        volume = 0;
        type = "не указано";
    }

    public HDD(String name, double volume, String type)
    {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void getInfoAboutHdd()
    {
        System.out.println("-------- HDD ---------");
        System.out.println("HDD Name: " + name);
        System.out.println("HDD Type: " + type);
        System.out.println("HDD Volume: " + volume);
    }
}
