package complex_tests;

import complex_tasks.task2.InvalidUserException;
import complex_tasks.task2.User;
import complex_tasks.task2.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
public  class UserValidatorTest {
    private final UserValidator validator = new UserValidator();
    @BeforeEach
    void setUp(){
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
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }
    @Test
    @DisplayName("Проверка некорректного возраста(меньше)")
    void checkInvalidUserYoungAge() {
        User user = new User("Albina", 8, "alba-madona@mail.ru");
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }
    @Test
    @DisplayName("Проверка некорректного возраста(меньше, граничное значение)")
    void checkInvalidUserBorderAge() {
        User user = new User("Albina", 17, "alba-madona@mail.ru");
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }

    @Test
    @DisplayName("Проверка некорректного возраста(больше)")
    void checkInvalidUserOldAge() {
        User user = new User("Albina", 101, "alba-madona@mail.ru");
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }
    @Test
    @DisplayName("Проверка некорректного email")
    void checkInvalidUserEmail() {
        User user = new User("Albina", 32, "alba-madonamail.ru");
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }
    @Test
    @DisplayName("Проверка корректного email")
    void checkBoundaryMinAge() {
        User user = new User("Albina", 17, "alba-madona@mail.ru");
        assertThrows(InvalidUserException.class,() -> validator.validate(user),"validationEnabled установлен в false");
    }
    @Test
    @DisplayName("Проверка, что если флаг validationEnabled = false, то валидация не будет происходить")
    void testValidationDisabled() {
        UserValidator.validationEnabled = false;
        User user = new User("Albina", 3, "alsk92k");
        assertDoesNotThrow(() -> validator.validate(user));
    }

}
