package prepereToMock.OOP20;

import java.util.HashSet;
import java.util.Set;

/*"В системе есть курс.
У курса есть:
название

список зарегистрированных студентов
список студентов, которые завершили курс
Нужно реализовать систему, которая может:
зарегистрировать студента на курс
отмтить курс как завершенный для студента
проверить, зарегистрирован ли студент
проверить, завершил ли студент курс
посчитать количество зарегистрированных студентов
посчитать количество студентов, завершивших курс

Правила:
одного и того же студента нельзя зарегистрировать дважды
завершить курс может только зарегистрированный студент
если студент уже завершил курс, повторно добавлять его нельзя

Пример:
Зарегистрированы:
Anna
Boris
Завершили курс:
Anna
Количество зарегистрированных:
2
Количество завершивших:
1"*/
public class Course {
    private String name;
    Set<String> regStudent = new HashSet<>();
    Set<String> finishedCourseStudent = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public void registerStudent(String student){
        regStudent.add(student);
        System.out.println("Студент зарегистрирован на курс: " + student);
    }
    public void completedStudent(String student){
        if (regStudent.contains(student)) {
            finishedCourseStudent.add(student);
            regStudent.remove(student);
            System.out.println("Студент завершил курс: " + student);
        }
    }
   // проверить, зарегистрирован ли студент
    public boolean isRegStudent(String student){
        return regStudent.contains(student);
    }
  //  проверить, завершил ли студент курс
    public boolean isComplStudent(String student){
        return finishedCourseStudent.contains(student);
    }
 //   посчитать количество зарегистрированных студентов
    public int countOfRegStudent(){
        return regStudent.size();
    }
    public int countOfComplStudent(){
        return finishedCourseStudent.size();
    }
  //  посчитать количество студентов, завершивших курс

}
