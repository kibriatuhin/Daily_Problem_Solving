package leetCode;

import java.util.*;
import java.util.function.BiConsumer;

public class FindPlayers2225 {
    public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> plist = new ArrayList<>();
        Set<Integer> result1 = new HashSet<>();
        List<Integer> result2 = new ArrayList<>();


        for (int[] match : matches) {
            map.put(match[1], map.getOrDefault(match[1], 0) + 1);
        }
        //System.out.println(map);
        for (int[] match : matches) {
            if (!map.containsKey(match[0])) {
                    result1.add((match[0]));
            }
        }

      // System.out.println(result1);
        map.forEach((integer, integer2) -> {
            if (integer2==1){
                result2.add(integer);
            }
        });

        plist.add(new ArrayList<>(result1));
        plist.add(result2);
        Collections.sort(plist.get(0));
        Collections.sort(plist.get(1));
        return plist;
    }
    public static void main(String[] args) {
        int[][] matches ={{1, 3}, {2, 3}, {3, 6}, {5,6}, {5, 7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        System.out.println( findWinners(matches));
       // System.out.println(matches.length);

    }
}
