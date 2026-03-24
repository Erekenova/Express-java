package practice_5.task_7;
/*Условие:
В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
Примеры:
Американские горки — проверка безопасности
Карусель — техническое обслуживание
Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.*/
public class Main {
    public static void main(String[] args) {
        Attraction rollerCoaster = new RollerCoaster();
        Attraction carousel = new Carousel();
        Park city = new Park();
        city.add(rollerCoaster);
        city.showInformation();

        city.add(carousel);
        city.showInformation();
    }
}
