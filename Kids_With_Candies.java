import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Kids_With_Candies {
    public static List<Boolean> solution(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        // LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
        // for(int i = 0 ; i < candies.length; i ++){
        // map.put( candies[i], i);
        // }
        // for(int i = 0 ; i < candies.length; i ++){

        // if(candies[i] + extraCandies > )
        // }
        int max = candies[0];
        for (int i = 1; i < candies.length; i++) {
            if (max < candies[i]) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            int x = candies[i] + extraCandies;
            list.add(x >= max);
        }

        return list;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 1, 12 };
        System.out.println(solution(arr, 10));
    }
}
