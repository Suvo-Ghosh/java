public class ContainerWithMostWater {

    // 1. O(n) - Brute Force
    public static void soluation_1(int[] arr) {
        int maxWater = 0;
        for (int i = 0; i < arr.length; i++) {
            int area = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    area = arr[i] * (j - i);
                } else {
                    area = arr[j] * (j - i);
                }
                maxWater = Math.max(area, maxWater);
            }
        }
        System.out.println(maxWater);
    }

    // 2. O(n) - Two-Pointer
    public static void soluation_2(int[] arr) {
        int maxWater = 0;
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int area = (right - left) * Math.min(arr[left], arr[right]);
            maxWater = Math.max(maxWater, area);
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println(maxWater);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 3, 1, 3, 2, 4, 1 };
        soluation_1(arr);
        soluation_2(arr);
    }
}
