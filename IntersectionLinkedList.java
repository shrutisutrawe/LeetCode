package Leetcode;

public class IntersectionLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int a =0, b=0;
        while(temp1 != null){
            a++;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            b++;
            temp2 = temp2.next;
        }
        temp1 = headA; temp2= headB;
        int diff = Math.abs(a-b);
        while(diff != 0){
            if(a>b){
                temp1 = temp1.next;
            }else{
                temp2 = temp2.next;
            }
            diff--;
        }
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return null;
    }
}
