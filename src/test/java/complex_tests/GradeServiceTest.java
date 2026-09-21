package complex_tests;

import complex_tasks.task3.GradeService;
import complex_tasks.task3.InvalidGradeException;
import complex_tasks.task3.StudentGrade;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    @DisplayName("Проверка отклонения отрицательной дробной оценки")
    public void checkNegativeDoubleGrade() {
        GradeService<Double> doubleService = new GradeService<>();
        assertThrows(InvalidGradeException.class,
                () -> doubleService.addGrade(new StudentGrade<>("Альбина", "математика", -0.5)));
        assertEquals(0, doubleService.getAll().size());
    }

    @Test
    @DisplayName("Проверить конкурентное добавление оценок и чтение списка")
    public void checkConcurrentAddAndGetAll() throws InterruptedException {
        GradeService<Integer> concurrentService = new GradeService<>();
        int threads = 10;
        int perThread = 20;
        ExecutorService pool = Executors.newFixedThreadPool(threads);
        CountDownLatch start = new CountDownLatch(1);
        CountDownLatch done = new CountDownLatch(threads);
        for (int i = 0; i < threads; i++) {
            int threadIndex = i;
            pool.submit(() -> {
                try {
                    start.await();
                    for (int j = 0; j < perThread; j++) {
                        concurrentService.addGrade(new StudentGrade<>("Student" + threadIndex, "математика", 5));
                        concurrentService.getAll();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                } finally {
                    done.countDown();
                }
            });
        }
        start.countDown();
        assertTrue(done.await(10, TimeUnit.SECONDS));
        pool.shutdown();
        assertEquals(threads * perThread, concurrentService.getAll().size());
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
