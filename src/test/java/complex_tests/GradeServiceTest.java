package complex_tests;

import complex_tasks.task3.GradeService;
import complex_tasks.task3.InvalidGradeException;
import complex_tasks.task3.StudentGrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/*Протестируйте корректность работы добавления оценок, расчёта среднего значения и обработки исключений при некорректных оценках.
**/
class GradeServiceTest {
private final GradeService<Integer> service = new GradeService<>();
    @Test
    @DisplayName("Проверить корректность добавления оценок")
    public void checkAddGrade(){
       // StudentGrade<Integer> expectedStudent = new StudentGrade<>("Альбина","математика", 5);
        service.addGrade(new StudentGrade<>("Альбина","математика", 5));
        List<StudentGrade<Integer>> grades = service.getAll();
        assertEquals(1, grades.size());
        assertEquals("Альбина", grades.get(0).getName());
        assertEquals("математика", grades.get(0).getSubject());
        assertEquals(5, grades.get(0).getGrade());
    }
    @Test
    @DisplayName("Проверка вычисления среднего значения оценки")
    public  void checkAverageGrade(){
        service.addGrade(new StudentGrade<>("Альбина","математика", 5));
        service.addGrade(new StudentGrade<>("Альбина","математика", 4));
        service.addGrade(new StudentGrade<>("Альбина","математика", 5));
        service.addGrade(new StudentGrade<>("Альбина","физика", 5));
        service.addGrade(new StudentGrade<>("Азамат","математика", 2));
        service.addGrade(new StudentGrade<>("Марат","русский", 4));
        double average = service.averageGrade("Математика");
        assertEquals(4.0,average);
    }
    @Test
    @DisplayName("Проверка обработки исключений при некорректных оценках ")
    public void checkInvalideGrade(){
        assertThrows(InvalidGradeException.class, () -> service.addGrade(new StudentGrade<>("Альбина",
                "математика", -10)));
    }
    @Test
    @DisplayName("Проверка обработки исключений расчете среднего значения по предмету, которого нет в сервисе ")
    public void checkInvalideSubject(){
        service.addGrade(new StudentGrade<>("Альбина","математика", 5));
        service.addGrade(new StudentGrade<>("Альбина","математика", 4));
        service.addGrade(new StudentGrade<>("Альбина","математика", 5));
        service.addGrade(new StudentGrade<>("Альбина","физика", 5));
        service.addGrade(new StudentGrade<>("Азамат","математика", 2));
        service.addGrade(new StudentGrade<>("Марат","русский", 4));
        assertThrows(IllegalArgumentException.class, () -> service.averageGrade("литература"),"Нет оценок по заданному предмету");
    }
}
