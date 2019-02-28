package algorithm;

import java.util.Arrays;

public class QuickSort2 {

    private static int partition(int arr[], int low, int high) {
        int pivotKey = arr[low];
        while (low < high) {
            while (low < high && arr[high] >= pivotKey) {
                high--;
            }
            arr[low] = arr[high];

            while (low < high && arr[low] <= pivotKey) {
                low++;
            }

            arr[high] = arr[low];
        }
        arr[low] = pivotKey;
        return low;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivotLoc = partition(arr, low, high);
            quickSort(arr, low, pivotLoc - 1);
            quickSort(arr, pivotLoc + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] originArr = {49, 38, 65, 97, 76, 13, 27, 49};
        System.out.println(partition(originArr, 0, originArr.length - 1));
        System.out.println(Arrays.toString(originArr));
        quickSort(originArr, 0, originArr.length - 1);
        System.out.println(Arrays.toString(originArr));
    }
}
