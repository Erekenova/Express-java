package programmingPrinciples.task5;

public class CreditCard extends PaymentType{
    public CreditCard(double amount) {
        super(amount);
    }

    @Override
    public void paid() {
        System.out.println("Оплата кредитной картой на сумму " + getAmount());
    }
}
