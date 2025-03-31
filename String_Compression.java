public class String_Compression {
    public static int solution(char[] arr) {
        int index = 0;
        int i = 0;
        while ((i < arr.length)) {
            int j = i;
            while (j < arr.length && arr[i] == arr[j]) {
                j++;
            }
            arr[index++] = arr[i];
            if (j - i > 1) {
                String count = j - i + "";
                for (char ch : count.toCharArray()) {
                    arr[index++] = ch;
                }
            }
            i = j;
        }
        return index;
    }

    public static void main(String[] args) {
        char[] ch = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };
        System.out.println(solution(ch));
    }
}
