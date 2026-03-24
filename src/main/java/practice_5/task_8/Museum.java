package practice_5.task_8;

public class Museum {
    private Exhibit exhibit;

    public void add(Exhibit exhibit){
        this.exhibit = exhibit;
        System.out.println("Экспонат добавлен в музей.");
    }
    public void showInfo(){
        exhibit.displayInfo();
        exhibit.manage();
    }
}
