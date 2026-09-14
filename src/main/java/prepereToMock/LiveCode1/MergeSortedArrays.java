package prepereToMock.LiveCode1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MergeSortedArrays {
    public int[] mergeSortedArrays(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            result[k++] = a[i] < b[j] ? a[i++] : b[j++];
        }
        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];
        return result;
    }
    public static int[] mergeArrays(int[]a ,int [] b){
        int[] result = IntStream.concat(IntStream.of(a), IntStream.of(b))
                .toArray();
       Arrays.sort(result);
       return result;
    }

    static void main() {
        int[] a = {1,2,6,2,3,9};
        int [] b = {0,-1,4,7};
        System.out.println(Arrays.toString(mergeArrays(a, b)));
    }

}
