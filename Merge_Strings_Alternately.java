public class Merge_Strings_Alternately {
    public static String solution(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                res.append(word1.charAt(i));
                i++;
            }

            if (j < word2.length()) {
                res.append(word2.charAt(j));
                j++;
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrxy";
        System.out.println(solution(word1, word2));
    }
}
