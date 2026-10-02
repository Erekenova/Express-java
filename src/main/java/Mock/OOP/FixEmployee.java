package Mock.OOP;

public class FixEmployee extends Employee{
    private double salary;

    public FixEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public double paySalary() {
        return getSalary();
    }
}
