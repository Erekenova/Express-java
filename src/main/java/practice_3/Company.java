package practice_3;

import java.util.Objects;

public class Company {
    static String companyName = "Ип Абжетов";
    final int employeeID;
    private String employeeName;
    Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public static void printCompanyName(){
        System.out.println("Название компании " + companyName);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return employeeID == company.employeeID && Objects.equals(employeeName, company.employeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeID, employeeName);
    }
}
