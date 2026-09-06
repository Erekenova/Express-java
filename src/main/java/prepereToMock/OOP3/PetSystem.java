package prepereToMock.OOP3;

import java.util.List;

public class PetSystem {
    public static void goToEat(List<Pet> pets){
        for (Pet pet : pets) {
            pet.eat();
        }
    }
    public static void goToSleep(List<Pet> pets) {
        for (Pet pet : pets) {
            pet.sleep();
        }
    }

    static void main() {
        List<Pet> pets = List.of(
                new Cat("Барсик"),
                new Dog("Шарик"),
                new Dragon("Дрого"));
        goToEat(pets);
        goToSleep(pets);

    }
}
