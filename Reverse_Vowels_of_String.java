public class Reverse_Vowels_of_String {
    public static String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            if ("AEIOUaeiou".contains(arr[left] + "")) {

                if ("AEIOUaeiou".contains(arr[right] + "")) {
                    char c = arr[left];
                    arr[left] = arr[right];
                    arr[right] = c;
                    left++;
                    right--;
                } else {

                    right--;
                }
            } else {

                left++;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String str = "IceCreAm";
        System.out.println(reverseVowels(str));
    }
}
