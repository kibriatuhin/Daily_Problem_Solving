package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate217 {
    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.println(containsDuplicate2(new int[]{1, 2, 3, 1}));
    }
}
