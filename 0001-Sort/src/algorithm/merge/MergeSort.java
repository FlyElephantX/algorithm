package algorithm.merge;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class MergeSort extends BaseSort {

    public void sort(int[] arr) {
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("归并排序结果:" + Arrays.toString(arr));
    }

    public void mergeSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    public void merge(int[] arr, int low, int mid, int high) {
        int len = high - low + 1;
        int[] temp = new int[len];
        int left = low;
        int right = mid + 1;
        int i = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i++] = arr[left++];
            } else {
                temp[i++] = arr[right++];
            }
        }
        while (left <= mid) {
            temp[i++] = arr[left++];
        }
        while (right <= high) {
            temp[i++] = arr[right++];
        }
        for (int j = 0; j < len; j++) {
            arr[low + j] = temp[j];
        }
    }
}
