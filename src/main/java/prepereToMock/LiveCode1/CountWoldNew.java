package prepereToMock.LiveCode1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//Подсчитать, сколько раз каждое слово встречается в строке.
//"Я иду гулять по лесу в лесу много грибов"
//я-1
public class CountWoldNew {
    public static  Map<String,Integer> countS(String str){
        Map<String,Integer> map = new HashMap<>();
        List<String> stringList = List.of(str.split(" "));
        for (String s : stringList) {
           map.put(s, map.getOrDefault(s,0) + 1);
        }
        return map;
    }
    static void main() {
        System.out.println(countS("Я иду гулять по лесу в лесу много грибов"));

    }
}
