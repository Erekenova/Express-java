package prepereToMock.LiveCode1;

import java.util.Iterator;

public class SumOfArray {
    public static int sumArray(int[] arr){
        int sum = 0;
       for (int num : arr) sum+= num;
        return sum;

    }

    static void main() {
        System.out.println(sumArray(new int[]{1,2,3,4,5,6,}));



    }
}
