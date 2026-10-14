package prepereToMock.OOP1;


public class Main {
    static void main() {
        Employee employee1 = new HourlyEmployee("Анна", 48,250);
        Employee employee2 = new CommissionEmployee("Борис", 30,50000);
        Employee employee3 = new FixedSalaryEmployee("Дарья", 30000);
        SalaryService salaryService = new SalaryService();
        salaryService.add(employee1);
        salaryService.add(employee2);
        salaryService.add(employee3);
        salaryService.paySalaries();

    }
}
