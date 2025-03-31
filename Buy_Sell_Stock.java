public class Buy_Sell_Stock {
    // 1. Brute Force
    public static void buyAndSell(int[] arr) {
        int buy = arr[0];
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < buy) {
                buy = arr[i];
            } else if (profit < arr[i] - buy) {
                profit = arr[i] - buy;
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        // int[] arr = { 5, 2, 8, 4, 6, 9, 3 };
        int[] arr2 = { 5, 4, 3, 2 };
        buyAndSell(arr2);
    }
}