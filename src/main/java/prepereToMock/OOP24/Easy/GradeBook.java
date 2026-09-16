package prepereToMock.OOP24.Easy;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GradeBook {
    Map<String, List<Integer>> grades = new HashMap<>();

    public void addGrade(String name, int grade) {
        if (!grades.containsKey(name)) {
            grades.put(name, new LinkedList<>(List.of(grade)));
        } else {
            grades.get(name).add(grade);
        }
    }

    public List<Integer> getGrades(String name) {
        if (grades.containsKey(name)) {
            return grades.get(name);
        }
        return List.of();
    }

    public double getAverageGrade(String name) {
        List<Integer> studentGrades = getGrades(name);
        if (studentGrades.isEmpty()) {
            return 0.0;
        }
        int sum = 0;
        for (int grade : studentGrades) {
            sum += grade;
        }
        return (double) sum / studentGrades.size();
    }

    public boolean hasStudent(String name) {
        return grades.containsKey(name);
    }

    public int getStudentCount() {
        return grades.size();
    }
}
