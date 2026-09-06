package prepereToMock.OOP1;

public class HourlyEmployee extends Employee{
    private double hours;
    private double hourlyRate;

    public HourlyEmployee(String name, double hours, double hourlyRate) {
        super(name);
        this.hours = hours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double paySalary() {
        return hours * hourlyRate;
    }
}
