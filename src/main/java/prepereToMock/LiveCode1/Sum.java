package prepereToMock.LiveCode1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.UIManager.put;

public class Sum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

    static void main() {
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 3, 4, 5, 6, 1}, 7)));
    }
}
