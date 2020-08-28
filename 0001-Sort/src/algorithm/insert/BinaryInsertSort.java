package algorithm.insert;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class BinaryInsertSort extends BaseSort {

    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int low = 0;
            int high = i - 1;
            int cur = arr[i];
            while (low <= high) {
                int mid = (low + high) / 2;
                if (arr[mid] > cur) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            for (int j = i; j > low; j--) {
                arr[j] = arr[j - 1];
            }
            arr[low] = cur;
        }
        System.out.println("折半插入排序结果:" + Arrays.toString(arr));
    }
}
