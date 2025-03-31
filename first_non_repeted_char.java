import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class first_non_repeted_char {

    // 1. Using Two Loops (Brute Force)
    public static char first_non_repeted_character_1(String str) {
        for (int i = 0; i < str.length(); i++) {
            boolean isRepeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return str.charAt(i);
            }
        }
        return '\0';
    }

    // 2. Using LinkedHashMap
    public static char first_non_repeted_character_2(String str) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return '\0';
    }

    // 3. Two pass HashMap
    public static char first_non_repeted_character_3(String str) {
        // First Pass: Count character frequencies
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Second Pass: Find the first character with frequency 1
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        String str = "Subsu";
        System.out.println(first_non_repeted_character_1(str.toLowerCase()));
        System.out.println(first_non_repeted_character_2(str.toLowerCase()));
        System.out.println(first_non_repeted_character_3(str.toLowerCase()));
    }
}