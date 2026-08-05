package complex_tasks.task2;
/*Разработайте систему валидации для модели данных пользователя, которая проверяет корректность имени,
возраста и электронной почты. Валидация должна управляться через глобальный флаг validationEnabled, который может быть включен или выключен.
 Если данные не проходят валидацию, должно выбрасываться специализированное исключение InvalidUserException.

Модель данных:
User: Класс пользователя с атрибутами для имени, возраста и электронной почты.
Класс валидатора:
UserValidator: Сервис, который предоставляет методы для проверки объектов User на соответствие определенным правилам.
Функциональные требования:
Проверка имени: Имя должно быть не пустым и начинаться с заглавной буквы.
Проверка возраста: Возраст должен быть в пределах от 18 до 100 лет.
Проверка email: Email должен соответствовать стандартному формату электронной почты.
Управление валидацией: Валидация данных должна происходить только если флаг validationEnabled установлен в true.
Исключения: При обнаружении невалидных данных необходимо выбрасывать InvalidUserException.*/

public class UserValidator {
    public static boolean validationEnabled = true;
    public void validate(User user){
        if (!validationEnabled) {
            System.out.println("validationEnabled установлен в false.");
            return;
        }
        System.out.println(user);
        checkName(user.getName());
        checkAge(user.getAge());
        checkEmail(user.getEmail());
    }
    public void checkName(String name) {
        if ((name != null)  && (name.matches("^\\p{Lu}.*"))) {
            System.out.println("Валидация имени успешна");
        } else {
            throw new InvalidUserException("Валидация имени не прошла");
        }
    }
    public void checkAge(int age) {
        if ( (age >= 18) && (age <= 100)) {
            System.out.println("Валидация возраста успешна");
        } else {
            throw new InvalidUserException("Валидация возраста не пройдена");
        }
    }
    public void checkEmail(String email) {
        if (email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$")) {
            System.out.println("Валидация email пройдена");
        } else {
            throw new InvalidUserException("Валидация email не пройдена");
        }
    }
}

