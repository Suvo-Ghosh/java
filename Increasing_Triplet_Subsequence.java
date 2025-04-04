public class Increasing_Triplet_Subsequence {
    public static boolean increasingTriplet(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] > nums[i]) {
                j = i;
            }
            if ((i - j) == 2) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 0, 4, 6 };
        System.out.println(increasingTriplet(arr));
    }
}
