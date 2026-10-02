package Mock.OOP;

public class HourEmployee extends Employee{
    int countHour;
    double sal;

    public HourEmployee(String name, int countHour, int sal) {
        super(name);
        this.countHour = countHour;
        this.sal = sal;
    }

    public int getCountHour() {
        return countHour;
    }

    public double getSal() {
        return sal;
    }

    @Override
    public double paySalary() {
        return getCountHour() * getSal();
    }
}
