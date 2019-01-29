package algorithm;

/**
 * 二分查找
 */
public class BinarySearch {
    /**
     * 返回要找的x值在数组中的下标,如果不存在返回 -1
     */
    public static int binarySearch(int[] arr, int x) {
        if (arr.length == 0) {
            return -1;
        }

        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
