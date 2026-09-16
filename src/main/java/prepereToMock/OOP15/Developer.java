package prepereToMock.OOP15;

public class Developer {
    private final String name;
    private final String role;
    private final double salary;

    public Developer(String name, String role, double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " — " + role + " — " + (int) salary;
    }
}
