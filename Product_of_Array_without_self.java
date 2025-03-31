import java.util.Arrays;

public class Product_of_Array_without_self {

    // 1. O(n) - But not working if array contains ZERO value
    public static void solve_1(int[] arr) {
        int product = 1;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            res[i] = product / arr[i];
        }

        System.out.println(Arrays.toString(res));
    }

    // 2. O(n^2) - Brute Force
    public static void solve_2(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }
        System.out.println(Arrays.toString(result));
    }

    // 3. O(n) -
    public static void solve_3(int[] arr) {
        int n = arr.length;
        int[] result = new int[arr.length];
        for (int i = 0; i < n; i++) {
            result[i] = 1;
        }

        int leftProduct = 1;
        for (int i = 0; i < n; i++) {
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= rightProduct;
            rightProduct *= arr[i];
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 0, 7 };
        // solve_1(arr);
        solve_2(arr);
        solve_3(arr);
    }
}
