package prepereToMock.LiveCode1;

public class ReverseArray {
    public void reverseArray(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
        int temp = nums[left];
        nums[left++] = nums[right];
        nums[right--] = temp;}
    }
}
