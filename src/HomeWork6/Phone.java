package HomeWork6;

public class Phone {
   protected long number;
   protected String model;
   protected double weight;

   public Phone()
   {}

    public Phone(long number, String model)
    {
        this.number = number;
        this.model = model;
    }

    public Phone(long number, String model, double weight)
    {
        this(number,model);
        this.weight = weight;
    }

    public long getNumber()
    {
        return number;
    }

    public void receiveCall (String name)
   {
       System.out.println("Звонит " + name);
   }

   public void reciveCall (String name, long number)
   {
       System.out.println("Звонит " + name + "\n" + number);
   }

   public void sendMessage(Long ... numbers)
   {
       for (int i = 0; i < numbers.length; i++) {
           System.out.println(numbers[i]);
       }
   }
}
