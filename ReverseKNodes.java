package Leetcode;

public class ReverseKNodes {
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null || k < 2){
            return head;
        }
        int N =0;
        ListNode tempNode1 = head;
        while(tempNode1 != null){
            N++;
            tempNode1 = tempNode1.next;
        }
        tempNode1 = head;
        head = reverseKNodes(head,k,N);
        return head;
    }
    private static ListNode reverseKNodes(ListNode head, int k, int N){
        ListNode front = head.next;
        ListNode middle = head;
        ListNode back = null;
        int count = 1;
        while(front != null && count != k){
            middle.next = back;
            back = middle;
            middle = front;
            front = front.next;
            count++;
        }
        middle.next = back;
        if(front == null){
            head = middle;
            return head;
        }
        ListNode tempNode1 = null;
        if(N - k >= k){
            N = N-count;
            tempNode1 = reverseKNodes(front,k,N);
        }
        ListNode tail = middle;
        while(tail.next != null){
            tail = tail.next;
        }
        if(tempNode1 != null){
            front = tempNode1;
        }
        tail.next = front;
        head = middle;
        return head;
    }
}
