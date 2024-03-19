package homeWork_4;

public class Test {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard(123, 2000);

        CreditCard card2 = new CreditCard(456,4500);

        CreditCard card3 = new CreditCard(789,3300);

        card1.creditingMoneyToTheCard(550);
        card2.creditingMoneyToTheCard(500);
        card3.withdrawingMoneyFromTheCard(5000);

        card1.infoAboutTheCard();
        card2.infoAboutTheCard();
        card3.infoAboutTheCard();
    }
}
