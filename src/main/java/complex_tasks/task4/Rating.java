package complex_tasks.task4;

import java.util.ArrayList;
import java.util.List;

public class Rating <T extends Number>{
   private final T value;

    public Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public double doubleValue() {
        return value.doubleValue();
    }

    @Override
    public String toString() {
        return "Rating{" +
                "value=" + value +
                '}';
    }
}
