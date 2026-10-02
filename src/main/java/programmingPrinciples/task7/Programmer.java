package programmingPrinciples.task7;

public class Programmer implements Workable,Eatable{
    @Override
    public void eat() {
        throw new UnsupportedOperationException("Программист не ест на работе");
    }
    @Override
    public void work() {
        System.out.println("Программист пишет код");
    }
}
