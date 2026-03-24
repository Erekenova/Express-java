package practice_5.task_5;

public class Farm {
    private FarmAnimal farmAnimal;
    public void add(FarmAnimal farmAnimal){
        this.farmAnimal = farmAnimal;
        System.out.println("Животное добавлено на ферму.");
    }
    public void manageAnimal(){
        farmAnimal.care();
        farmAnimal.function();
    }
}
