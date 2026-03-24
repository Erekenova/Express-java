package practice_5.task_7;

public class Park {
    private Attraction attraction;
    public void add(Attraction attraction){
        this.attraction = attraction;
        System.out.println("Атракцион добавлен в парк.");
    }
    public void showInformation(){
        attraction.info();
        attraction.service();
    }
}
