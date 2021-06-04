package Leetcode;

public class RemoveElementsLL {
    public ListNode removeElements(ListNode head, int val) {
        if(head == null){
            return head;
        }
        if(head != null && head.val == val){
            head= head.next;
        }
        ListNode tempNode = head;
        while(tempNode != null){
            while(tempNode.next != null && tempNode.next.val == val){
                tempNode.next = tempNode.next.next;
            }
            tempNode = tempNode.next;
        }
        return head;
    }

}
