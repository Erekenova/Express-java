package practice_5.task_7;

public class RollerCoaster extends Attraction{
    @Override
    public void service() {
        System.out.println("Американские горки: необходима регулярная проверка безопасности.");
    }

    @Override
    public void info() {
        System.out.println("Американские горки высотой 100 метров!");

    }
}
