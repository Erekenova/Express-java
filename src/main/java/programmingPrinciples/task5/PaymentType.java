package programmingPrinciples.task5;

public abstract class PaymentType {
    private double amount;

    public PaymentType(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void paid();
}
