package algorithm.selection;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class HeapSort extends BaseSort {

    public void sort(int[] arr) {
        for (int i = arr.length / 2 - 1;  i >= 0; i--) {
            max_heapify(arr, i, arr.length - 1);
        }
        for (int i = arr.length - 1; i > 0; i--) {
            swap(arr, 0, i);
            max_heapify(arr, 0, i - 1);
        }
        System.out.println("堆排序结果:" + Arrays.toString(arr));
    }

    public void max_heapify(int[] arr, int start, int end) {
        int dad = start;
        int son = 2 * dad + 1;
        while (son <= end) {
            if (son + 1 <= end && arr[son] < arr[son + 1]) {
                son++;
            }
            if (arr[dad] > arr[son]) {
                return;
            } else {
                swap(arr, dad, son);
                dad = son;
                son = 2 * dad + 1;
            }
        }
    }
}
