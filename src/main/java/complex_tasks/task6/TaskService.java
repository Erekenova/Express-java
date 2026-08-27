package complex_tasks.task6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Сервис для управления задачами, включающий методы для добавления, удаления и поиска задач.
Управление задачами:
Добавление задачи: Метод для добавления новой задачи в список.
Удаление задачи: Метод для удаления задачи по ID. Метод должен быть синхронизирован для предотвращения конкурентного доступа.
Поиск задач: Методы для фильтрации задач по статусу и приоритету, а также сортировка задач по дате.*/
public class TaskService <T> {
    private List<Task<T>> tasks = new ArrayList<>();
    public synchronized  void addTask(Task<T> task){
        boolean exist = tasks.stream().anyMatch(existingTask -> existingTask.getId().equals(task.getId()));
        if (exist) {
            throw  new IllegalArgumentException("Задача с таким ID сущствует");
        }
        tasks.add(task);
    }
    public synchronized boolean deleteTask(T id){
        return tasks.removeIf(task ->task.getId().equals(id));
    }
    public List<Task<T>> findByStatus(Status status){
        return  tasks.stream()
                .filter(task ->task.getStatus().equals(status)).collect(Collectors.toList());
    }
    public List<Task<T>> findByPriority(Priority priority){
        return tasks.stream()
                .filter(task->task.getPriority().equals(priority)).collect(Collectors.toList());
    }
    public List<Task<T>> sortedByDate(){
        return tasks.stream()
                .sorted((task1, task2) -> task1.getDate().compareTo(task2.getDate()))
                .collect(Collectors.toList());
    }
    public List<Task<T>> sortByDateDesc(){
        return tasks.stream()
                .sorted((task1, task2) -> task2.getDate().compareTo(task1.getDate()))
                .collect(Collectors.toList());
    }
    public List<Task<T>> getAllTasks(){
        return new ArrayList<>(tasks);
    }
}
