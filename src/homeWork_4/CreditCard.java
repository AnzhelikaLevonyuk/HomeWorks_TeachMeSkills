package homeWork_4;

public class CreditCard {
    public int cardNumber;
    public double amountOnTheCard;

    public CreditCard(int cardNumber, double amountOnTheCard)
    {
        this.cardNumber = cardNumber;
        this.amountOnTheCard = amountOnTheCard;
    }

    //Добавьте метод, который позволяет начислять сумму на кредитную карточку.
     public double creditingMoneyToTheCard(double sum)
     {
         amountOnTheCard += sum;
         return amountOnTheCard;

     }

    //Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    public double withdrawingMoneyFromTheCard(double sum)
    {
        if ( amountOnTheCard > sum)
        {
            amountOnTheCard -= sum;
            return amountOnTheCard;
        }
        else
        {
            return -1;
        }
    }

    //Добавьте метод, который выводит текущую информацию о карточке (номер счета, текущая сумма на счету).
    public void infoAboutTheCard()
    {
        System.out.println("\nНомер счета: " + cardNumber);
        System.out.println("Текущая сумма счета: " + amountOnTheCard);
    }

}
