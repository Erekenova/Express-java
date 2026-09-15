package prepereToMock.OOP14;

public class Main {
    static void main() {
        University university = new University("IT University");

        university.addStudent(new Student("Анна", 101, 4.8));
        university.addStudent(new Student("Борис", 102, 4.2));
        university.addStudent(new Student("Мария", 103, 5.0));

        university.showStudents();

        System.out.println("Средний балл по университету:");
        System.out.printf("%.2f%n", university.getAverageGrade());

        university.findByRecordNumber(102);

        university.removeStudent(102);
        System.out.println("После удаления Бориса:");
        university.showStudents();
        System.out.printf("%.2f%n", university.getAverageGrade());
    }
}
