package Leetcode;

public class RemoveNthNode {
    public ListNode removeNthFromEnd(ListNode head, int n){
        if(head == null || (head.next == null && n ==1)){
            return null;
        }
        ListNode front = head;
        ListNode back = head;
        int count = 0;
        while(front != null && n !=0){
            n--;
            front = front.next;
        }
        if(front == null){
            head = head.next;
        }
        while(front != null && front.next != null){
            back = back.next;
            front = front.next;
        }
        back.next = back.next.next;
        return head;
    }
}
