package leetCode;

import java.util.Arrays;

public class ConcatenationOfArray1929 {
    public static int[] getConcatenation(int[] nums) {

        int[] result = new int[nums.length + nums.length];
        int count = 0 ;
        for(int i=0 ; i<nums.length ; i++){
            result[count++] = nums[i];
        }
        for(int i=0 ; i<nums.length ; i++){
            result[count++] = nums[i];
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,3,4,5})));
    }
}
