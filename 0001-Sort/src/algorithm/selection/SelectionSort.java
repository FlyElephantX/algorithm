package algorithm.selection;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class SelectionSort extends BaseSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, min, i);
        }
        System.out.println("选择排序的结果:" + Arrays.toString(arr));
    }
}
