package algorithm;

class UpperBound {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_(int n, int v, int[] a) {
        // write code here
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] >= v) {
                if (mid == 0 || a[mid - 1] < v) {
                    return mid + 1;
                } else {
                    high = mid;
                }
            } else {
                low = mid + 1;
            }
        }
        return n + 1;
    }
}

public class Solution {

    public static void main(String[] args) {
        UpperBound upper = new UpperBound();
        int[] a = {3,3,4,4,4,5,6,6,6,7,8,8,12,13,15,16,21,21,22,24,24,27,28,32,34,35,35,36,36,39,40,41,41,42,44,44,45,45,47,47,47,47,48,48,50,51,51,53,53,53,54,54,54,56,56,57,59,60,60,60,60,61,62,63,65,65,65,65,67,67,68,70,71,71,74,75,75,79,81,84,84,86,86,87,90,90,90,90,91,92,93,94,94,94,95,97,97,98,98,99};
        int res = upper.upper_bound_(100, 97, a);
        System.out.println("最终索引的位置:" + res);
    }
}
