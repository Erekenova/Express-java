package prepereToMock.OOP15;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private final String name;
    private final List<Developer> developers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void removeDeveloper(String name) {
        developers.removeIf(developer -> developer.getName().equals(name));
    }

    public void findDeveloperByName(String name) {
        Developer found = developers.stream()
                .filter(developer -> developer.getName().equals(name))
                .findFirst()
                .get();
        System.out.println(found);
    }

    public void showAllDevelopers() {
        System.out.println("Разработчики команды " + name + ":");
        for (Developer developer : developers) {
            System.out.println("* " + developer);
        }
    }

    public double getSalaryFund() {
        double sum = 0;
        for (Developer developer : developers) {
            sum += developer.getSalary();
        }
        return sum;
    }
}
