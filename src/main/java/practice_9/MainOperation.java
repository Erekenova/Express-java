package practice_9;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntSupplier;

public class MainOperation {
    public static void main(String[] args) {
        MathOperations add = (x,y) -> x + y;
        MathOperations subtract = (x,y) -> x - y;
        MathOperations multiply = (x,y) -> x * y;
        MathOperations divide = (x,y) -> x / y;
        try{
        System.out.println(add.apply(2,3));
        System.out.println(multiply.apply(2,4));
        System.out.println(divide.apply(10,2));
        System.out.println(subtract.apply(10,5));
        }
        catch (ArithmeticException e){
            throw new ArithmeticException("Ошибка при делении.");
        }

        AtomicInteger x = new AtomicInteger(0);
        IntSupplier s = x::incrementAndGet ;
        System.out.println(s.getAsInt());
        System.out.println(s.getAsInt());
        System.out.println(x.get());
    }
}
