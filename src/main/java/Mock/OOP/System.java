package Mock.OOP;

import java.util.ArrayList;
import java.util.List;

public class System {
  List<Employee> employeeList = new ArrayList<>();
    public void paySalaryS(){
        for (Employee employee : employeeList) {
            java.lang.System.out.println(employee.getName() + " получил " + employee.paySalary());
        }
    }
    public void add(Employee employee){
        employeeList.add(employee);
    }

}
