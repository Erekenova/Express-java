package prepereToMock.LiveCode1;
// 56311094479

public class SecondMax {
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) secondMax = i;
        }
        return secondMax;
    }

    static void main() {
        System.out.println(findSecondMax(new int[]{5,6,3,1,1,0,9,4,4,7,9}));
    }
}
