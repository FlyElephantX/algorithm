package algorithm.insert;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class InsertSort extends BaseSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
                j--;
            }
        }
        System.out.println("直接插入排序结果:" + Arrays.toString(arr));
    }
}
