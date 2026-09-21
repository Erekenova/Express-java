package prepereToMock.OOP20;

import java.util.Set;

public class Main {
    static void main() {


        Course course = new Course("High heels");
        course.registerStudent("Anna");
        course.registerStudent("Boris");
        System.out.println("Количество зарегистрировавшихся на  курс " + course.countOfRegStudent());
        course.completedStudent("Anna");
        System.out.println("Количество зарегистрировавшихся на  курс " + course.countOfRegStudent());
        System.out.println("Количество завершивших курс " + course.countOfComplStudent());

    }
}