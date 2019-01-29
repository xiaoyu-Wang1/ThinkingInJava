package algorithm;

/**
 * 输入一个正整数a,输出下一个用a内数字组成的且比a大的正整数
 */
public class NextInteger {

    public static void main(String[] args) {
        System.out.println(getNextInt(1));
    }

    public static int getNextInt(int a) {
        String aStr = Integer.toString(a);
        int length = aStr.length();
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(aStr.substring(i, i + 1));
        }

        nextIntegerArr(arr);

        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += arr[i] * Math.pow(10, length - 1 - i);
        }

        return sum;
    }

    private static void nextIntegerArr(int[] a) {
        int len = a.length;
        // 1.从后往前找到第一个逆序点i,使得 a[i] < a[i+1] && a[i+1]>a[i+2]>a[i+3]...
        int i = len - 1;
        while (i > 0 && a[i] < a[i - 1]) {
            i--;
        }
        i--;
        System.out.println(i);
        // 2.从i+1开始往后找到数j,且a[j] > a[i] && a[j+1] <= a[i]
        int j = 0;
        if (i >= 0) {
            int k = i + 1;
            if (k < len - 1) {
                for (k = i + 1; k < len - 1; k++) {
                    if (a[k] > a[i] && a[k + 1] <= a[i]) {
                        break;
                    }
                }
                j = k;
            } else {
                j = k;
            }

            // 3.交换i和j位置上的数

            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

            // 4.对从i+1开始的逆序数列,翻转排序

            swapArr(a, i + 1, len - 1);
        }


    }

    private static void swapArr(int[] arr, int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}
