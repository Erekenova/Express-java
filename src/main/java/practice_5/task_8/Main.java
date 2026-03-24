package practice_5.task_8;
/*Условие:
В музее выставлен экспонат.
У каждого экспоната своя история и условия хранения.
Примеры:
Манускрипт — требует контролируемой влажности
Скульптура — нуждается в реставрации
Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.*/
public class Main {
    public static void main(String[] args) {
        Exhibit manuscript = new Manuscript();
        Exhibit sculpture = new Sculpture();
        Museum museum = new Museum();
        museum.add(manuscript);
        museum.showInfo();

        museum.add(sculpture);
        museum.showInfo();
    }


}
