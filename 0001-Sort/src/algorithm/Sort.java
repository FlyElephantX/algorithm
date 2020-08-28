package algorithm;

import algorithm.exchange.BubbleSort;
import algorithm.exchange.QuickSort;
import algorithm.insert.BinaryInsertSort;
import algorithm.insert.InsertSort;
import algorithm.insert.ShellSort;
import algorithm.merge.MergeSort;
import algorithm.selection.HeapSort;
import algorithm.selection.SelectionSort;

public class Sort {

    public static void main(String[] args) {
        int[] arr = {49, 38, 65, 97, 76, 13, 27, 49};
        // 1.直接插入排序
//        InsertSort sort = new InsertSort();
//        sort.sort(arr);
        // 2.折半插入排序
//        BinaryInsertSort sort = new BinaryInsertSort();
//        sort.sort(arr);
        // 3.希尔排序
        ShellSort sort = new ShellSort();
        sort.sort(arr);
        // 4.冒泡排序
//        BubbleSort sort = new BubbleSort();
//        sort.sort(arr);
        // 5.快速排序
//        QuickSort sort = new QuickSort();
//        sort.sort(arr);
        // 6.选择排序
//        SelectionSort sort = new SelectionSort();
//        sort.sort(arr);
        // 7.堆排序
//        HeapSort sort = new HeapSort();
//        sort.sort(arr);
//       int[] arr = {98, 97, 76, 13, 27, 49};
//        MergeSort sort = new MergeSort();
//        sort.sort(arr);
    }
}
