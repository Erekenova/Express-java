package prepereToMock.LiveCode1;

import java.util.HashSet;
import java.util.Set;

public class Unic {
    public static boolean checkUniq(int[] arr){
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if(!set.add(i)) return false;
        }
        return true;
    }

    static void main() {
        System.out.println(checkUniq(new int[]{1,2,3,4,5}));
    }
}
