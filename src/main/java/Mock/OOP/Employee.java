package Mock.OOP;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private String name;

    public Employee(String name) {
    }

    public String getName() {
        return name;
    }

    public abstract double paySalary();
}
