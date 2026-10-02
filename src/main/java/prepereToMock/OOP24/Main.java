package prepereToMock.OOP24;

import prepereToMock.OOP24.Easy.GradeBook;

public class Main {
    static void main() {
        GradeBook journal = new GradeBook();

        journal.addGrade("Anna", 5);
        journal.addGrade("Anna", 4);
        journal.addGrade("Boris", 3);

        System.out.println("Оценки:");
        System.out.println("Anna → " + journal.getGrades("Anna"));
        System.out.println("Boris → " + journal.getGrades("Boris"));

        System.out.println("Средний балл:");
        System.out.println("Anna → " + journal.getAverageGrade("Anna"));
        System.out.println("Boris → " + journal.getAverageGrade("Boris"));

        System.out.println("Anna в журнале: " + journal.hasStudent("Anna"));
        System.out.println("Количество студентов: " + journal.getStudentCount());
    }
}
