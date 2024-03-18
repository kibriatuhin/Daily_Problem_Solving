package leetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class UniqueNumber1207 {
    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        for (int n : arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
       // System.out.println(map);

        int count=0;
        for (Map.Entry<Integer,Integer> en : map.entrySet()){
            set.add(en.getValue());
            count++;
        }
       // System.out.println(count);
        //System.out.println(set.size());
        if (count==set.size())
            return true;

        return false;
    }
    public static void main(String[] args) {
        int[] array = {1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(array));
    }
}
