import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Partition_Labels {
    public static List<Integer> solution(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Record Last Occurrences
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), i);
        }

        List<Integer> list = new ArrayList<>();
        int size = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            size++;
            end = Math.max(end, map.get(s.charAt(i)));
            if (i == end) {
                list.add(size);
                size = 0;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "eccbbbbdec";
        System.out.println(solution(s));
    }
}
