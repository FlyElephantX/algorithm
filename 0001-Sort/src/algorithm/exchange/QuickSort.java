package algorithm.exchange;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class QuickSort extends BaseSort {

    public void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        System.out.println("快速排序结果:" + Arrays.toString(arr));
    }

    public void quickSort(int[] arr, int low, int high) {
        if (low > high) {
            return;
        }
        int index = partition(arr, low, high);
        quickSort(arr, low, index - 1);
        quickSort(arr, index + 1, high);
    }

    public int partition(int[] arr, int low, int high) {
        int index = low;
        int privot = arr[high];
        for (int i = low; i < high; i++) {
            if (arr[i] <= privot) {
                swap(arr, i, index);
                index = index + 1;
            }
        }
        swap(arr, index, high);
        return index;
    }
}
