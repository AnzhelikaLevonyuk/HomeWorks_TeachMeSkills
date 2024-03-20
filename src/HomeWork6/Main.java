package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone(1894545, "iPhone");
        Phone phone2 = new Phone(3471918, "iPhone");
        Phone phone3 = new Phone(7328913, "Huawei");

        System.out.println("Phone 1");
        phone1.receiveCall("Alex");
        System.out.println(phone1.getNumber());
        System.out.println("--receiveCall with two params--");
        phone1.reciveCall("Alex", phone1.number);


        System.out.println("\nPhone 2");
        phone2.receiveCall("Sasha");
        System.out.println(phone2.getNumber());
        System.out.println("--receiveCall with two params--");
        phone2.reciveCall("Sasha", phone2.number);

        System.out.println("\nPhone 3");
        phone3.receiveCall("Misha");
        System.out.println(phone3.getNumber());
        System.out.println("--receiveCall with two params--");
        phone3.reciveCall("Misha", phone3.number);


        System.out.println("\nСообщение будет отправлено: ");
        phone1.sendMessage(phone2.number, phone3.number);









    }
}
