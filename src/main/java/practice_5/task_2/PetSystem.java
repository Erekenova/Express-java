package practice_5.task_2;

public class PetSystem {
    private Pet pet;

    public void add(Pet newPet) {
        this.pet = newPet;
        System.out.println("Животное добавлено.");
    }

    public void handlePet() {
        if(this.pet == null){
            return;
        }
        this.pet.eat();
        this.pet.interact();
    }
}
