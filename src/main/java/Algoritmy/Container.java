package Algoritmy;


    public class Container {

        public static int findContainerWithMostWater(int[] array) {
            int left = 0;
            int right = array.length - 1;
            int maxArea = 0;

            while (left < right) {

                int height = Math.min(array[left], array[right]);
                int weight = right - left;

                if (maxArea < height * weight) {
                    maxArea = height * weight;
                }
                if (array[left] < array[right]) {
                    left++;
                } else right--;
            }
            return maxArea;
        }

        public static void main(String[] args) {
            System.out.println(findContainerWithMostWater(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
        }
    }

