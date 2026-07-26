package complex_tasks.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

/*Разработайте класс EntityManager<T>, который будет управлять коллекцией объектов произвольного типа T, обеспечивая потокобезопасное добавление, удаление и получение элементов.
 Класс также должен предоставлять специфические методы фильтрации данных,
 которые позволяют пользователю извлекать элементы по определённым критериям.

Функциональные требования:

Добавление элементов: Метод для добавления объекта в коллекцию. Должен быть потокобезопасным.
Удаление элементов: Метод для удаления объекта из коллекции. Возвращает true, если объект был удалён, и false, если объект не найден в коллекции. Должен быть потокобезопасным.
Получение всех элементов: Метод возвращает копию списка всех элементов, обеспечивая невозможность изменения исходной коллекции через возвращаемый список.
Специализированные методы фильтрации:
Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
*/
public class EntityManager<T>{
    private final CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();
    public void add(T entity){
        entities.add(entity);
    }
    public boolean remove(T entity){
       return entities.remove(entity);
    }
    public List<T> getAll(){
        return List.copyOf(entities);
    }

    public  List<T> filterByAge(int min, int max){
        return entities.stream()
                .filter(entity -> entity instanceof User)
                .map(e -> (User) e)
                .filter(user -> user.getAge() >= min && user.getAge() <= max)
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }
    public List<T> filterByName(String name){
        return entities.stream()
                .filter(e -> e instanceof User)
                .map(e -> (User) e)
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }
    public List<T> filterByActivity(boolean active){
        return entities.stream()
                .filter(e -> e instanceof User)
                .map( e -> (User) e)
                .filter(user -> user.isActive() == active)
                .map(user -> (T) user)
                .collect(Collectors.toList());
    }


}
