package Leetcode;

public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode front = head;
        ListNode medium = head;
        ListNode back = null;
        if(head.next != null){
            front = head.next;
        }
        while(front != null){
            medium.next = back;
            back = medium;
            medium = front;
            front = front.next;
        }
        medium.next = back;
        head = medium;
        return head;
    }
}
