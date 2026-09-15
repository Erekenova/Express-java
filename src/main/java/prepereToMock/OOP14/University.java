package prepereToMock.OOP14;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class University {
    private final String name;
    private final List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int recordNumber) {
        students.removeIf(student -> student.getRecordNumber() == recordNumber);
    }

    public void findByRecordNumber(int recordNumber) {
        Student find =  students.stream()
                .filter(student -> student.getRecordNumber() == recordNumber)
                .findFirst()
                .get();
        System.out.println(find);
    }

    public void showStudents() {
        System.out.println("Студенты университета " + name + ":");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public double getAverageGrade() {
        if (students.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Student student : students) {
            sum += student.getAverageGrade();
        }
        return sum / students.size();
    }
}
