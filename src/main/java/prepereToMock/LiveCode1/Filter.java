package prepereToMock.LiveCode1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//оставить только строки начинающиеся с А
public class Filter {
    public static List<String> filter(List<String> stringList){
        return stringList.stream().filter(str ->str.startsWith("A"))
                .collect(Collectors.toList());
    }

    static void main() {
        System.out.println( filter(new ArrayList<>(List.of("Albina","Tomiris", "Alex", "NArgiz", "albina"))));
    }
}
