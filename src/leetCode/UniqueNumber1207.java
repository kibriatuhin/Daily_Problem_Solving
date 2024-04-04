package leetCode;

import java.math.BigDecimal;
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
    static int test(){
        try{
            System.out.println("try");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("Finally");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(test());

    }
}
