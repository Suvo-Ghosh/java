public class MaxSubArraySum {
    // 1. O(n^2) - Brute Force
    public static void Max_Sub_Array_Sum_1(int[] arr) {
        int maxSum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        System.out.println(maxSum);
    }

    // 2. Kadane's Algorithm
    public static void Max_Sub_Array_Sum_2(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            currentSum = Math.max(arr[i], currentSum + arr[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println("Kadane's Algorithm -" + maxSum);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        Max_Sub_Array_Sum_1(arr);
        Max_Sub_Array_Sum_2(arr);
    }
}
