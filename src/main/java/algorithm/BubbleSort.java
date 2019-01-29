package algorithm;

/**
 * 冒泡排序
 */
public class BubbleSort {

    public static void sort(int[] originArr) {
        int len = originArr.length;
        // 无需排序
        if (len <= 1) {
            return;
        }

        int temp = 0;
        // 从后往前依次缩小比较范围
        for (int j = len - 1; j > 0; j--) {
            // 每次冒泡,将最大的一个元素换到最后
            for (int i = 0; i < j; i++) {
                if (originArr[i] > originArr[i + 1]) {
                    temp = originArr[i];
                    originArr[i] = originArr[i + 1];
                    originArr[i + 1] = temp;
                }
            }
        }
    }
}
