import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class findDuplicates {
    // 1. Using HashMap
    public static void find_duplicaates_using_HashMap(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }

    // 2. Sorting
    public static void find_duplicates_using_sorting(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                System.out.println(arr[i]);
            }
        }
    }

    // 3. Using HashSet
    public static void find_duplicates_using_HashSet(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            if (!set.add(n)) {
                System.out.println(n);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 3, 2, 4, 8, 5, 2 };
        find_duplicaates_using_HashMap(arr);
        find_duplicates_using_sorting(arr);
        find_duplicates_using_HashSet(arr);
    }
}
