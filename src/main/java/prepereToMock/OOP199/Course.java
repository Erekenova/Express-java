package prepereToMock.OOP199;

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
    private String title;
    private Set<String> registeredSudents = new HashSet<>();
    private Set<String> compleatedStudent = new HashSet<>();

    public Course(String title) {
        this.title = title;
    }

    //зарегистрировать студента на курс
    public void registerStudent(String student){
        if(isComplete(student)){
            System.out.println("Нельзя повторно зарегистрировать на курс!");
        } else {
        registeredSudents.add(student);
        System.out.println("Студент зарегистрирован: "+ student);
        }
    }
   // отметить курс как завершенный для студента
   public void setCompleteStudent(String student){
        if (isRegister(student)){
            compleatedStudent.add(student);
            System.out.println("Студент завершил курс " + student);
        } else System.out.println("Студент не зарегистрирован на курс");
    }
    //проверить, зарегистрирован ли студент
    public boolean isRegister(String student){
        return  (registeredSudents.contains(student));
    }
    //проверить, завершил ли студент курс
    public boolean isComplete(String student){
        return (compleatedStudent.contains(student));
    }
    //посчитать количество зарегистрированных студентов
    public void countRegisterStident(){
        System.out.println("Количество зарегистрированных студентов " + registeredSudents.size());
    }
   // посчитать количество студентов, завершивших курс
   public void countCompletedStudents(){
        System.out.println("Количество студентов завершивших курс " + compleatedStudent.size());
    }
}
