package programmingPrinciples.task5;

public class PayPal extends PaymentType{
    public PayPal(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Оплата через PayPal на сумму " + getAmount());
    }
}
