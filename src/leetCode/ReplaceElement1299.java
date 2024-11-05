package leetCode;

import java.util.Arrays;

public class ReplaceElement1299 {
    public  static int[] replaceElements(int[] arr) {
        int[] newArray = new int[arr.length];
        for(int i=0 ;i<arr.length-1 ; i++){
            int max = arr[i+1];
            for(int j=i+1 ; j<arr.length ; j++){
                max = Math.max(max, arr[j]);
            }
            newArray[i] = max;
        }
        newArray[arr.length-1] = -1;
        return newArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,5,4,6,1})));
    }
}
