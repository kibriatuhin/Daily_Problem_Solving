package dataStructureAndAlgorithom.sorting;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] array){
        for (int i=0 ; i<array.length-1 ; i++){
            for (int j=0 ; j<array.length-i-1 ; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        bubbleSort(new int[]{11,4,8,1,2});
    }
}
