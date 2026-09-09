package prepereToMock.LiveCode1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        return new ArrayList<>(new HashSet<>(list));
    }

    static void main() {
        System.out.println(removeDuplicates(new ArrayList<>(List.of(2,3,1,3,2,4,3,2,4,6))));
    }
}
