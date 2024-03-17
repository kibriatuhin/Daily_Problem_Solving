package leetCode;

import java.util.Arrays;

public class MissingNumber {
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0],last = nums[nums.length-1] ,sum1 =0,sum2=0;
        for (int i=small ; i<=last ; i++){
            sum1 = sum1 + i;
        }
        for (int num : nums) {
            sum2 = sum2 + num;
        }
        return sum1-sum2;


    }
    public static void main(String[] args) {
        int[] array = {3,0,1};
        System.out.println(missingNumber(array));
    }
}
