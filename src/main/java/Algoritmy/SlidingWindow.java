package Algoritmy;

import java.util.HashSet;
import java.util.Set;

/*Задача 1. Самый длинный период стабильной работы
Сервер ежедневно либо работал корректно (1), либо был недоступен (0).
Компания готова проигнорировать не более k аварий, считая, что они были ложными срабатываниями мониторинга.
Определите максимальную длину непрерывного периода, который можно считать стабильным.
Пример:

Статус по дням:

1 1 0 1 1 0 1 1 1

Можно проигнорировать одну аварию.

Ответ:
6
берем окно размером k
пройдем по массиву
[1]

2)
[1 1]

3)
[1 1 0]

4)
[1 1 0 1]

5)
[1 1 0 1 1]

6) добавили второй ноль

[1 1 0 1 1 0]

двигаем left

1 [1 0 1 1 0]
1 1 [0 1 1 0]
1 1 0 [1 1 0]   ✔

7)
1 1 0 [1 1 0 1]

8)
1 1 0 [1 1 0 1 1]

9)
1 1 0 [1 1 0 1 1 1]   ← ответ

*/
public class SlidingWindow {
    public static String findLongestPeriod(int[] array, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        for (right = 0; right < array.length; right++){
            if (array[right] == 0){
                count++;
            }
            if (count > k){
                if (array[left] == 0){
                    count--;
                }
                left++;
            }
        }

        return null;
    }


    /*Задача 3. Работа переводчика
Переводчик печатает текст.
Необходимо определить максимальную длину фрагмента, в котором ни одно слово не встречается дважды.
Например

cat dog bird dog fish
 Ответ 3

Потому что самый длинный уникальный фрагмент —
 cat dog bird*/
    public  static int findLongestWorld(String[] words){
        int left = 0;
        int right = 0;
        int maxLen = 0;
        Set<String> set = new HashSet<>();
        for (right = 0; right < words.length; right++){
            while (set.contains(words[right])){
                set.remove(words[left]);
                left++;
            }
            set.add(words[right]);
            maxLen = Math.max(maxLen, right - left + 1);
            }
        return maxLen;
    }


    static void main() {
        int[] arr = {1, 1, 0, 1, 1, 0, 1, 1, 1,};
        System.out.println(findLongestPeriod(arr,1));
        String[] words = {"cat", "dog", "bird", "dog", "fish"};
        System.out.println(findLongestWorld(words));
    }
}
