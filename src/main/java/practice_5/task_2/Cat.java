package practice_5.task_2;

public class Cat extends Pet implements Playable{

        @Override
        public void eat() {
                System.out.println("Кошка ест влажный корм.");
        }

        @Override
        public void play() {
                System.out.println("Кошка играет.");
        }
}
