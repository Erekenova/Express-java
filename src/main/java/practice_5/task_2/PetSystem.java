package practice_5.task_2;

public class PetSystem {
    private Pet pet;

    public void add(Pet newPet) {
        this.pet = newPet;
        System.out.println("Животное добалено.");
    }

    public void interact() {

        this.pet.eat();

        if (this.pet instanceof Playable) {

            Playable playablePat = (Playable) this.pet;
            playablePat.play();
        }
        else System.out.println("Животное не играет!");
        if (this.pet instanceof Walkable) {

            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        }
        else  System.out.println("Животное не гуляет!");
    }

}
