package Leetcode;

public class DeleteNNodesAfterMNodes {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        if(head.next == null){
            return head;
        }
        ListNode temp1 = head;
        while(temp1 != null){
            int count1 = 1, count2 = 1;
            while(temp1 != null && count1 < m){
                count1++;
                temp1 = temp1.next;
            }
            if(temp1 == null){
                break;
            }
            ListNode temp2 = null;
            if(temp1 != null && temp1.next != null){
                temp2 = temp1.next;
            }
            while(temp2 != null && count2 <= n){
                count2++;
                temp2 = temp2.next;
            }
            temp1.next = temp2;
            temp1 = temp1.next;
        }
        return head;
    }
}
