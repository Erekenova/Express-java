package complex_tests;

import complex_tasks.task1.EntityManager;
import complex_tasks.task1.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


/*
* Проверить добавление, когда список пуст. И что в список добавлен наш элемент
* проверить добаление, когда список не пуст. То что добавили равно тому что передали
* проверить размер листа после добавления 0->1, 1->2
Проверить удаление пользователя, был юзер в списке -> удалили -> true
* Проверить удаление пользователя, не было юзера в списке -> удалили -> false
* Фильтрация по возрасту: Возвращает список пользователей в заданном возрастном диапазоне.
Фильтрация по имени: Возвращает список пользователей, чьи имена соответствуют заданной строке.
Фильтрация по активности: Возвращает список пользователей с заданным статусом активности.
 */

public class EntityManagerTest {
    private static EntityManager<User> manager;

    @BeforeEach
    void setUp() {

        manager = new EntityManager<>();
    }

    @Test
    @DisplayName("Проверить добавление пользователя, когда список пуст и что после добавления размер 1")
    public void testAddUser() {
        User expectedUser = new User("Albina", 32, true);
        manager.add(expectedUser);
        List<User> users = manager.getAll();
        assertEquals(1, users.size());
        //Проверка по
        assertEquals("Albina", users.get(0).getName());
        assertEquals(32, users.get(0).getAge());
        assertEquals(true, users.get(0).isActive());


    }

    @Test
    @DisplayName("Проверить добавления двух пользователей и что размер списка 0 -> 2")
    public void testAddUserOneSize() {
        User expectedUser = new User("Diiar", 33, true);
        User expectedUser2 = new User("Albina", 32, true);
        manager.add(expectedUser);
        manager.add(expectedUser2);
        List<User> users = manager.getAll();
        assertEquals(2, users.size());
    }

    @Test
    @DisplayName("Проверить удаление элементов")
    public void checkRemoveUeer() {
        User user = new User("Albina", 32, true);
        manager.add(user);
        assertTrue(manager.remove(user));
        assertFalse(manager.remove(user));
    }

    public static Stream<Object> positiveCasesForCheckingFilterbyAge() {
        return Stream.of(
                Arguments.of(20, 60,
                        Arrays.asList(
                                new User("Albina", 32, true),
                                new User("Mariya", 55, true)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingFilterbyAge")
    @DisplayName("Проверить фильтрацию по возрасту")
    public void checkFilteredByAge(int min, int max, List<User> expectedList) {
        User user1 = new User("Albina", 32, true);
        User user2 = new User("Nargiz", 4, true);
        User user3 = new User("Mariya", 55, true);
        manager.add(user1);
        manager.add(user2);
        manager.add(user3);
        List<User> actualList = manager.filterByAge(min, max);
        assertEquals(expectedList, actualList);
    }

    public static Stream<Arguments> boundaryCasesForCheckingFilterByAge() {
        return Stream.of(
                Arguments.of(
                        20, 29,
                        List.of(new User("Azamat", 20, true)
                        )
                ),
                Arguments.of(
                        21, 30,
                        List.of(new User("Gauhar", 30, true)
                        )
                ),
                Arguments.of(20, 40,
                        Arrays.asList(
                                new User("Azamat", 20, true),
                                new User("Gauhar", 30, true),
                                new User("Albina", 40, true)
                        )
                )
        );
    }

    @ParameterizedTest
    @MethodSource("boundaryCasesForCheckingFilterByAge")
    @DisplayName("Проверка граничных значений")
    public void checkFilterByAgeBoundary(int min, int max, List<User> expectedList) {
        manager.add(new User("Azamat", 20, true));
        manager.add(new User("Gauhar", 30, true));
        manager.add(new User("Albina", 40, true));
        manager.add(new User("Diiar", 41, true));
        manager.add(new User("Nurlan", 19, true));
        List<User> actualList = manager.filterByAge(min, max);
        assertEquals(expectedList, actualList);
    }

    public static Stream<Arguments> positiveCasesForCheckingFilterByName() {
        return Stream.of(
                Arguments.of("albina",
                        List.of(new User("Albina", 32, true))
                ),
                Arguments.of("Mariya",
                        List.of(new User("Mariya", 55, true))
                ),
                Arguments.of("Nargiz",
                        List.of(new User("Nargiz", 4, true))
                )
        );
    }
    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingFilterByName")
    @DisplayName("Проверить фильтрацию по имени, том числе на equalsIgnoreCase ")
    void checkFilteredByName(String name, List<User> expectedList) {
        User user1 = new User("Albina", 32, true);
        User user2 = new User("Nargiz", 4, true);
        User user3 = new User("Mariya", 55, true);
        manager.add(user1);
        manager.add(user2);
        manager.add(user3);
        List<User> actualList = manager.filterByName(name);
        assertEquals(expectedList, actualList);
    }
    @Test
    @DisplayName("Проверка фильтрации по имени, если имени нет в списке")
    void checkFilteredByNameWhenNameNotFound() {
        manager.add(new User("Albina", 32, true));
        manager.add(new User("Mariya", 55, true));
        List<User> actualList = manager.filterByName("Nargiz");
        assertTrue(actualList.isEmpty());
    }
    public static Stream<Arguments> positiveCasesForCheckingFilterByActive() {
        return Stream.of(
                Arguments.of(true,
                        List.of(new User("Albina", 32, true),
                                new User("Mariya", 55, true))),
                Arguments.of(false,
                        List.of(new User("Aslbek", 55, false)))
                );
    }
    @ParameterizedTest
    @MethodSource("positiveCasesForCheckingFilterByActive")
    @DisplayName("Проверить фильтрацию по активности")
    void checkFilteredByActivity(Boolean activity, List<User> expectedList) {
        User user1 = new User("Albina", 32, true);
        User user2 = new User("Aslbek", 55, false);
        User user3 = new User("Mariya", 55, true);
        manager.add(user1);
        manager.add(user2);
        manager.add(user3);
        List<User> actualList = manager.filterByActivity(activity);
        assertEquals(expectedList, actualList);
    }
}

