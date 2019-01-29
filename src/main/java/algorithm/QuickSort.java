package algorithm;

import java.util.Arrays;

/**
 * 快速排序:递归的思想,分割,递归调用
 */
public class QuickSort {

    /**
     * 一趟快速排序
     */
    private static int partition(int[] originArr, int low, int high) {
        // 1.保存书轴位置的元素值
        int pivotKey = originArr[low];
        while (low < high) {
            // 2.从high开始往前找,找到第一个小于pivotKey的值
            while (low < high && originArr[high] >= pivotKey) {
                high--;
            }
            // 3.和low位置的元素交换,low已经被保存为pivotKey,所以可以直接覆盖
            originArr[low] = originArr[high];
            // 4.从 low 开始往后找,找到第一个大于pivotKey的值
            while (low < high && originArr[low] <= pivotKey) {
                low++;
            }
            // 5.覆盖 high 位置的元素
            originArr[high] = originArr[low];
        }
        // 6.low == high的位置保存书轴元素并返回书轴下标
        originArr[low] = pivotKey;
        return low;
    }
    
    public static void quickSort(int[] originArr, int low, int high) {
        if (low < high) {
            // 1.分割
            int pivot = partition(originArr, low, high);
            // 2.递归调用:分割前的数组排序
            quickSort(originArr, low, pivot - 1);
            // 2.递归调用:分割后的数组排序
            quickSort(originArr, pivot + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] originArr = {49, 38, 65, 97, 76, 13, 27, 49};
        System.out.println(partition(originArr, 0, originArr.length - 1));
        System.out.println(Arrays.toString(originArr));
        quickSort(originArr, 0 , originArr.length - 1);
        System.out.println(Arrays.toString(originArr));
    }
}
