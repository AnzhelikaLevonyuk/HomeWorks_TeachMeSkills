package homeWork_4_Dop;

public class RAM {
    public String name;
    public double volume;

    public RAM()
    {

    }

    public RAM (String name, double volume)
    {
        this.name = name;
        this.volume = volume;
    }

    public void getInfoAboutRam()
    {
        System.out.println("-------- RAM ---------");
        System.out.println("RAM Name: " + name);
        System.out.println("RAM Volume: " + volume);
    }
}
