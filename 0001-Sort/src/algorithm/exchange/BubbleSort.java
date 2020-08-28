package algorithm.exchange;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class BubbleSort extends BaseSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j , j + 1);
                }
            }
        }
        System.out.println("冒泡排序结果:" + Arrays.toString(arr));
    }
}
