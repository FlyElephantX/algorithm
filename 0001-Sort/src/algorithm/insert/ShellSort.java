package algorithm.insert;

import algorithm.base.BaseSort;

import java.util.Arrays;

public class ShellSort extends BaseSort {

    public void sort(int[] arr) {
        int n = arr.length;
        int h = 1;
        while (h < n / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = 0; i < arr.length; i++) {
//                int j = i;
//                while (j - h >= 0 && arr[j] < arr[j - h]) {
//                    swap(arr, j, j - h);
//                    j = j - h;
//                }
                for (int j = i; j < arr.length - h; j++) {
                    if (arr[j] > arr[j + h]) {
                        swap(arr, j, j + h);
                    }
                }
            }
            h = h / 3;
        }
        System.out.println("希尔排序结果:" + Arrays.toString(arr));
    }
}
