package Leetcode;

import java.util.Stack;

public class PalindromeLinkedList {
    public static boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        if (head.next == null) {
            return true;
        }
        ListNode front = head.next;
        ListNode back = head;
        while (front.next != null) {
            back = back.next;
            front = front.next;
            if (front.next != null) {
                front = front.next;
            }
        }
        ListNode secondHalf = back.next;
        back.next = null;
        secondHalf.printList(secondHalf);
        ListNode front1 = secondHalf.next;
        ListNode middle = secondHalf;
        ListNode back1 = null;
        while (front1 != null) {
            middle.next = back1;
            back1 = middle;
            middle = front1;
            front1 = front1.next;
        }
        middle.next = back1;
        back = middle;
//        back.printList(back);
        front = head;
        while (back != null && front != null) {
            if (back.val != front.val) {
                return false;
            }
            back = back.next;
            front = front.next;
        }
        return true;
    }
}
