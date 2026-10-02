package Mock.OOP;

public class PercEmployee extends Employee{
    double perc;
    double sumP;

    public PercEmployee(String name, double perc, double sumP) {
        super(name);
        this.perc = perc;
        this.sumP = sumP;
    }

    public double getPerc() {
        return perc;
    }

    public double getSumP() {
        return sumP;
    }

    @Override
    public double paySalary() {
        return getPerc() * getSumP() /100;
    }
}
