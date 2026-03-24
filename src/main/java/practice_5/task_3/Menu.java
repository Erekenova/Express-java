package practice_5.task_3;

public class Menu {
    private  Dish dish;
    public void add(Dish dish){
        this.dish = dish;
        System.out.println("Блюдо добавлено!");
    }
    public void printDiscription(){
      dish.showDiscription();
    }
}
