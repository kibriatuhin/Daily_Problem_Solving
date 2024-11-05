package dataStructureAndAlgorithom.sorting;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            int minIndex = i;
            for (int j= i+1 ; j<arr.length ; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        selectionSort(new int[]{3,1,5,11,2});
    }
}
