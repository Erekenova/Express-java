package practice_9.striamApi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Нужно разделить числа на две группы: чётные и нечётные. Сначала получаем поток из списка.
// Затем используем collect с Collectors.groupingBy(...), передавая в качестве ключа булевое выражение n % 2 == 0.
// В результате получится отображение: true — список чётных чисел, false — нечётных.
//Методы:
//stream()
//collect(...)
//Collectors.groupingBy(...)
//n -> n % 2 == 0
public class GroupingByEven {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(2,1,3,2,5,6,7,1,2,3,4);
        Map<Boolean,List<Integer>> grouping = integerList.stream()
                .collect(Collectors.groupingBy(i -> i % 2 == 0));
        System.out.println(grouping);
    }

}
