package programmingPrinciples.task5;

public class Bitcoin extends PaymentType{
    public Bitcoin(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Оплата Bitcoin на сумму " + getAmount());
    }
}
