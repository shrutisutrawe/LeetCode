package Leetcode;

public class Add2Numbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode front1 = l1;
        ListNode front2 = l2;
        ListNode result = new ListNode(-1);
        ListNode head = result;
        ListNode tempNode = null;
        int sum = 0, carry = 0;
        while (front1 != null || front2 != null) {
            int num1 = (front1 != null) ? front1.val : 0;
            int num2 = (front2 != null) ? front2.val : 0;

            sum = carry + num1 + num2;
            carry = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            if (head.val == -1) {
                head = newNode;
                head.next = null;
                tempNode = head;
            } else {
                tempNode.next = newNode;
                tempNode = tempNode.next;
            }
            if (front1 != null) {
                front1 = front1.next;
            }
            if (front2 != null) {
                front2 = front2.next;
            }
        }
        if (carry > 0) {
            tempNode.next = new ListNode(carry);
        }
        return head;
    }

}
