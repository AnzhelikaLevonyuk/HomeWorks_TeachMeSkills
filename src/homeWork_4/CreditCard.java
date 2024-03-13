package homeWork_4;

public class CreditCard {
    int cardNumber;
    double amountOnTheCard;

    public CreditCard(int cardNumber, double amountOnTheCard)
    {
        this.cardNumber = cardNumber;
        this.amountOnTheCard = amountOnTheCard;
    }

    //Добавьте метод, который позволяет начислять сумму на кредитную карточку.
     public void creditingMoneyToTheCard(double sum)
     {
         amountOnTheCard += sum;
         System.out.println("\nОперация прошла успешнно! \nТекущая сумма счета: " + amountOnTheCard);
     }


    //Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    public void withdrawingMoneyFromTheCard(double sum)
    {
        if ( amountOnTheCard > sum)
        {
            amountOnTheCard -= sum;
            System.out.println("\nОперация прошла успешнно! \nТекущая сумма счета: " + amountOnTheCard);
        }
        else
        {
            System.out.println("\nУ вас недостаточно средств для проведения данной операции");
        }
    }

    //Добавьте метод, который выводит текущую информацию о карточке (номер счета, текущая сумма на счету).
    public void infoAboutTheCard()
    {
        System.out.println("\nНомер счета: " + cardNumber);
        System.out.println("Текущая сумма счета: " + amountOnTheCard);
    }

}
