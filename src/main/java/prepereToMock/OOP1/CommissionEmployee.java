package prepereToMock.OOP1;

public class CommissionEmployee extends Employee{
    private  double percent;
    private  double sales;

    public CommissionEmployee(String name, double percent, double sales) {
        super(name);
        this.percent = percent;
        this.sales = sales;
    }

    @Override
    public double paySalary() {
        return percent / 100 * sales;
    }
}
