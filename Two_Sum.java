import java.util.HashMap;

public class Two_Sum {
    // 1. Brute Force O(n^2)
    public static void two_sum_1(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            int remain = n - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (i != j && remain == arr[j]) {
                    System.out.println(i);
                    System.out.println(j);
                    return;
                }
            }
        }
    }

    // 2. HashMap O(n)
    public static void two_sum_2(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remain = n - arr[i];
            if (map.containsKey(remain)) {
                System.out.println(map.get(remain));
                System.out.println(i);
            }
            map.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 8, 9, 6, 7, 2 };
        int n = 10;
        two_sum_1(arr, n);
        two_sum_2(arr, n);
    }
}
