package prepereToMock.LiveCode1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortComparator {
    static void main() {
        List<String> str = new ArrayList<>(List.of("apple","orange","lemon","up"));
        str.sort(Comparator.comparing(String::length));
        System.out.println(str);
    }
}
