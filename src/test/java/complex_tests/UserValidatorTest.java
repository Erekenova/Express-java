package complex_tests;

import complex_tasks.task2.InvalidUserException;
import complex_tasks.task2.User;
import complex_tasks.task2.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserValidatorTest {
    private final UserValidator validator = new UserValidator();

    @BeforeEach
    void setUp() {
        UserValidator.validationEnabled = true;
    }

    @Test
    @DisplayName("Проверка корректного пользователя")
    void checkValidUser() {
        User user = new User("Albina", 32, "alba-madona@mail.ru");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    @DisplayName("Проверка некорректного имени")
    void checkInvalidUserName() {
        User user = new User("albina", 32, "alba-madona@mail.ru");
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("Валидация имени не прошла", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка некорректного возраста(меньше)")
    void checkInvalidUserYoungAge() {
        User user = new User("Albina", 8, "alba-madona@mail.ru");
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("Валидация возраста не пройдена", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка некорректного возраста(меньше, граничное значение)")
    void checkInvalidUserBorderAge() {
        User user = new User("Albina", 17, "alba-madona@mail.ru");
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("Валидация возраста не пройдена", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка некорректного возраста(больше)")
    void checkInvalidUserOldAge() {
        User user = new User("Albina", 101, "alba-madona@mail.ru");
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("Валидация возраста не пройдена", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка некорректного email")
    void checkInvalidUserEmail() {
        User user = new User("Albina", 32, "alba-madonamail.ru");
        InvalidUserException exception = assertThrows(InvalidUserException.class,
                () -> validator.validate(user));
        assertEquals("Валидация email не пройдена", exception.getMessage());
    }

    @Test
    @DisplayName("Проверка граничного возраста 18")
    void checkBoundaryMinAge() {
        User user = new User("Albina", 18, "alba-madona@mail.ru");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    @DisplayName("Проверка граничного возраста 100")
    void checkBoundaryMaxAge() {
        User user = new User("Albina", 100, "alba-madona@mail.ru");
        assertDoesNotThrow(() -> validator.validate(user));
    }

    @Test
    @DisplayName("Проверка, что если флаг validationEnabled = false, то валидация не будет происходить")
    void testValidationDisabled() {
        UserValidator.validationEnabled = false;
        User user = new User("Albina", 3, "alsk92k");
        assertDoesNotThrow(() -> validator.validate(user));
    }
}
