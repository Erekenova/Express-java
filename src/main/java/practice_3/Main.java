package practice_3;

public class Main {
    public static void main(String[] args) {
        Company employee1 = new Company(1, "Альбина");
        Company employee2 = new Company(2, "Дияр");
        Company.printCompanyName();
        Company.companyName = "ИП Ерекенов";
        Company.printCompanyName();
        System.out.println("Сотрудник: " + employee1.getEmployeeName() + " ID: " + employee1.employeeID);
        System.out.println("Площадь круга равна: " + MathConstants.calculateCircleArea(5));
        System.out.println("Длина окружности равна: " + MathConstants.calculateCircumference(5));
        University student1 = new University(1,"Потманцева Дарья");
        University student2 = new University(2,"Абжетова Томирис");
        University student3 = new University(3,"Григорьев Артем");
        student3.printStudentInfo();
        University.changeUniversityName("СГТУ им. Гагарина Ю.А.");
        student2.printStudentInfo();
        student1.printStudentInfo();
        GameSettings geme1 = new GameSettings("Зомби и растения");
        GameSettings geme2 = new GameSettings("Роблокс");
        geme1.setMaxPlayers(8);
        geme1.addPlayer();
        geme1.addPlayer();
        geme1.printGameStatus();

        Person person1 = new Person("Иван","Иванов", "165-458-68-84");
        Person person2 = new Person("Григорий","Александров", "165-458-85-94");
        person1.setFirstName("Олег");
        person1.printInfo();




    }
 }


