public class Reverse_Word {
    public static String solution(String s) {
        s = s.trim();

        // -> Using regex
        // String[] strArr = s.split("\\s+");
        // StringBuilder result = new StringBuilder();
        // for (int i = strArr.length - 1; i >= 0; i--) {
        // result.append(strArr[i]);
        // if (i > 0) {
        // result.append(" ");
        // }
        // }
        // return result.toString();

        String[] str = s.split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            if (!str[i].isEmpty()) {
                result.append(str[i]);
                if (i > 0) {
                    result.append(" ");
                }
            }

        }
        return result.toString().trim();

    }

    public static void main(String[] args) {
        String s = "a good   example";
        // System.out.println(s.split(" "));
        System.out.println(solution(s));
    }
}
