package complex_tasks.task3;

import java.util.ArrayList;
import java.util.List;

/*Cервис GradeService<T>:
Список List<StudentGrade<T>> для хранения оценок.
Метод для добавления оценки (addGrade), который также валидирует оценку на предмет того, что она не отрицательна.
Метод для расчёта среднего значения оценок по конкретному предмету.
Обеспечение потокобезопасности при добавлении оценок с использованием synchronized*/

public class GradeService <T extends Number>{
    private List<StudentGrade<T>> grades = new ArrayList<>();
    public synchronized void addGrade(StudentGrade<T> grade){
        if (grade.getGrade().intValue() < 0){
            throw new InvalidGradeException("Оценка не может быть отрицательной!");
        }
        grades.add(grade);
    }
   public synchronized double averageGrade(String subject){
        return  grades.stream()
                .filter(grade ->grade.getSubject().equalsIgnoreCase(subject))
                .mapToDouble(grade ->grade.getGrade().doubleValue())
                .average()
                .orElseThrow(() -> new IllegalArgumentException("Нет оценок по предмету:" + subject));
    }
    public List<StudentGrade<T>> getAll(){
        return List.copyOf(grades);
    }
}
