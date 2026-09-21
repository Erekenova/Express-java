package prepereToMock.LiveCode1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//массив строк
//ананас яблоки груши
public class Main {
    public static String[] arrStartsWith(String[] arr) {
        List<String> list = Arrays.stream(arr).filter(str -> str.startsWith("a")).collect(Collectors.toList());
        String[] ar = list.toArray(new String[0]);
        return ar;
    }
    public static String[] startWithA(String[] array){
        String[]  result = new String[array.length];
        int i = 0;
        for (String s : array) {
            if (s.startsWith("a")) {
                result[i] = s;
                i++;
            }
        }return result;
    }

    static void main() {
        String[] arr = new String[]{"apple", "pineapple", "pier","arbuz"};
        System.out.println(Arrays.toString(arrStartsWith(arr)));
        System.out.println(Arrays.toString(startWithA(arr)));

    }
}
