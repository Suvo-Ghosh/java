
// import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.Collections;

// import java.util.HashMap;

class Demo {

    // public static String reverseString(String str) {
    // String revString = "";
    // char[] charArr = str.toCharArray();
    // for (int i = charArr.length - 1; i >= 0; i--) {
    // revString += charArr[i];
    // }
    // return revString;
    // }

    // public static String revStr(String str) {
    // StringBuilder out = new StringBuilder();
    // char[] charArr = str.toCharArray();
    // for (int i = charArr.length - 1; i >= 0; i--) {
    // out.append(charArr[i]);
    // }
    // return out.toString();
    // }

    // public static boolean isPrime(int num) {

    // if (num < 2)
    // return false;

    // if (num == 2)
    // return true;

    // if (num % 2 == 0)
    // return false;

    // for (int i = 3; i <= Math.sqrt(num); i++) {
    // if (num % i == 0)
    // return false;
    // }
    // return true;
    // }

    // public static int factorial1(int n) {
    // if (n < 0)
    // return -1;
    // if (n <= 1)
    // return 1;
    // int result = 1;
    // for (int i = n; i >= 1; i--) {
    // result *= i;
    // }
    // return result;
    // }

    // public static int factorial2(int n) {
    // if (n <= 1)
    // return 1;
    // return n * factorial2(n - 1);
    // }

    // public static boolean palindrome(String str) {
    // int left = 0, right = str.length() - 1;
    // while (left < right) {
    // if (str.charAt(right) != str.charAt(left)) {
    // return false;
    // }
    // left++;
    // right--;
    // }
    // return true;
    // }

    // public static void fibonacci_1(int n) {
    // int a = 0, b = 1;
    // for (int i = 0; i < n; i++) {
    // System.out.println(a);
    // int c = a + b;
    // a = b;
    // b = c;
    // }
    // }

    // public static int fibonacci_2(int n) {
    // HashMap<Integer, Integer> memo = new HashMap<>();
    // if (n <= 1)
    // return n;
    // if (memo.containsKey(n))
    // return memo.get(n);

    // int result = fibonacci_2(n - 1) + fibonacci_2(n - 2);
    // memo.put(n, result);
    // return result;
    // }

    // public static int largestValue(int[] arr) {
    // int result = arr[0];
    // for (int i = 1; i < arr.length; i++) {
    // if (arr[i] > result) {
    // result = arr[i];
    // }
    // }
    // return result;
    // }

    public static int missingNum(int[] arr, int n) {
        int expectedTotal = n * (n + 1) / 2;
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return expectedTotal - sum;
    }

    public static void main(String[] args) {
        // String str = "ABCDEFG";
        // System.out.println(reverseString(str));
        // System.out.println(revStr(str));
        // System.out.println(isPrime(9));
        // System.out.println(factorial1(5));
        // System.out.println(factorial2(5));
        // System.out.println(palindrome("abdba"));
        // fibonacci_1(5);
        // for (int i = 0; i < 5; i++) {
        // System.out.println(fibonacci_2(i));
        // }

        // int[] arr1 = { 52, 86, 91, 63, 75 };
        // System.out.println(largestValue(arr1));

        int[] arr2 = { 2, 3, 5, 6 };
        System.out.println(missingNum(arr2, 5));

    }
}
