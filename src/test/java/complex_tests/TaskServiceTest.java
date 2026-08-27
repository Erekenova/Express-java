package complex_tests;

import complex_tasks.task6.Priority;
import complex_tasks.task6.Status;
import complex_tasks.task6.Task;
import complex_tasks.task6.TaskService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TaskServiceTest {
    private TaskService<Integer> taskService;
    @BeforeEach
    void setUp(){
        taskService = new TaskService<>();
    }
    @Test
    public void checkAddTask(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,27));
        taskService.addTask(task);
        List<Task<Integer>> tasks = taskService.getAllTasks();
        assertEquals(task,tasks.get(0));
        assertEquals(1,tasks.size());
    }
    @Test
    public void checkDeleteTask(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,27));
        taskService.addTask(task);
        boolean result = taskService.deleteTask(1);
        assertTrue(result);
        assertTrue(taskService.getAllTasks().isEmpty());
    }
    @Test
    public void checkFilterByStatus(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,27));
        Task<Integer> task2 = new Task<>(2, Status.COMPLETED, Priority.LOW, LocalDate.of(2026,8,27));
        Task<Integer> task3 = new Task<>(3, Status.NEW, Priority.MEDIUM, LocalDate.of(2026,8,27));
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<Integer>> result = taskService.findByStatus(Status.NEW);
        assertEquals(2,result.size());
        assertEquals(1,result.get(0).getId());
        assertEquals(3,result.get(1).getId());
    }

    @Test
    public void checkFilterByPriority(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,27));
        Task<Integer> task2 = new Task<>(2, Status.COMPLETED, Priority.LOW, LocalDate.of(2026,8,27));
        Task<Integer> task3 = new Task<>(3, Status.NEW, Priority.MEDIUM, LocalDate.of(2026,8,27));
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<Integer>> result = taskService.findByPriority(Priority.MEDIUM);
        assertEquals(1,result.size());
        assertEquals(3,result.get(0).getId());
    }
    @Test
    public void checkSortTaskByDate(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,28));
        Task<Integer> task2 = new Task<>(2, Status.COMPLETED, Priority.LOW, LocalDate.of(2026,8,27));
        Task<Integer> task3 = new Task<>(3, Status.NEW, Priority.MEDIUM, LocalDate.of(2026,8,20));
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<Integer>> result = taskService.sortedByDate();
        assertEquals(3,result.get(0).getId());
        assertEquals(2,result.get(1).getId());
        assertEquals(1,result.get(2).getId());
    }
    @Test
    public void checkSortTaskByDateDesk(){
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026,8,28));
        Task<Integer> task2 = new Task<>(2, Status.COMPLETED, Priority.LOW, LocalDate.of(2026,8,30));
        Task<Integer> task3 = new Task<>(3, Status.NEW, Priority.MEDIUM, LocalDate.of(2026,8,20));
        taskService.addTask(task);
        taskService.addTask(task2);
        taskService.addTask(task3);
        List<Task<Integer>> result = taskService.sortByDateDesc();
        assertEquals(2,result.get(0).getId());
        assertEquals(1,result.get(1).getId());
        assertEquals(3,result.get(2).getId());
    }
}
