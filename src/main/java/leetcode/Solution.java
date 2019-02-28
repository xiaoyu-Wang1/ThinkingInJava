package leetcode;

import net.mindview.simple.List;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode next; ListNode(int
 * x) { val = x; } }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 两个数中至少有一个为0
        if (l1.val == 0) {
            return l2;
        }
        if (l2.val == 0) {
            return l1;
        }
        // 两个数均不为0
        // 1.遍历链表算两数字各个位置之和
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0, sum = 0, temp = 0;
        while (l1 != null && l2 != null) {
            // 1.计算两个位数的和
            int bitSum = l1.val + l2.val + temp;
            // 2.存入数组
            arrayList.add(bitSum % 10);
            // 3.判断是否需要进位
            temp = bitSum > 10 ? 1 : 0;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while (l2 != null) {
                // 1.计算两个位数的和
                int bitSum = l2.val + temp;
                // 2.存入数组
                arrayList.add(bitSum % 10);
                // 3.判断是否需要进位
                temp = bitSum > 10 ? 1 : 0;
                l2 = l2.next;
            }
        }

        // 3.拆成链表
        int n = sum % 10;   //余数
        ListNode head = new ListNode(n);
        ListNode result = head;
        sum = (sum - n) / 10;
        while (sum > 0) {
            n = sum % 10;   //余数
            /*ListNode temp = new ListNode(n);
            head.next = temp;
            head = temp;*/
            sum = (sum - n) / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(8);
        ListNode l2 = new ListNode(1);
        Solution solution = new Solution();
        solution.addTwoNumbers(l1, l2);
    }
}

class ListNode {
    int val;  // 值
    ListNode next;    // 单向链表

    ListNode(int x) {
        val = x;
    }  // 构造函数
}