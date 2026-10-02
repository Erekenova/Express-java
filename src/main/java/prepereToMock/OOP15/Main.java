package prepereToMock.OOP15;

public class Main {
    static void main() {
        Team team = new Team("Express");

        team.addDeveloper(new Developer("Анна", "Backend Developer", 3000));
        team.addDeveloper(new Developer("Борис", "QA Engineer", 2500));
        team.addDeveloper(new Developer("Мария", "Frontend Developer", 2800));

        team.showAllDevelopers();

        System.out.println("Общий фонд зарплат:");
        System.out.println((int) team.getSalaryFund());

        team.findDeveloperByName("Анна");

        team.removeDeveloper("Борис");
        System.out.println("После удаления Бориса:");
        team.showAllDevelopers();
        System.out.println((int) team.getSalaryFund());
    }
}
