package test;

public class Solution {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode l2 = new ListNode(1);
        ListNode l3 = new ListNode(9);
        l2.next = l3;
        ListNode l4 = new ListNode(9);
        l3.next = l4;
        System.out.println(addTwoNumbers(l1, l2));

    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 两个数中至少有一个为0
        if(l1.val == 0) {
            return l2;
        }
        if(l2.val == 0) {
            return l1;
        }
        // 两个数均不为0
        int sum = 0;
        int i = 0, j = 0;
        while(l1 != null) {
            sum = sum + ((int)Math.pow(10, i)) * l1.val;
            l1 = l1.next;
            i++;
        }
        while(l2 != null) {
            sum = sum + ((int)Math.pow(10, j)) * l2.val;
            l2 = l2.next;
            j++;
        }
        System.out.println(Integer.MAX_VALUE > 100000000000L);
        ListNode head = null, temp = null;
        head = temp = new ListNode(sum % 10);
        sum = sum / 10;
        while(sum != 0) {
            temp.next = new ListNode(sum % 10);
            temp = temp.next;
            sum = sum / 10;
        }
        return head;
    }
}
