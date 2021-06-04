package Leetcode;

public class MergeLinkedList {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode temp1 = l1, temp2 = l2;

        ListNode mergedList = new ListNode();
        ListNode temp3 = mergedList;
        while (temp1 != null && temp2 != null) {
            if (temp1.val <= temp2.val) {
                temp3.next = temp1;
                temp1 = temp1.next;
            } else {
                temp3.next = temp2;
                temp2 = temp2.next;
            }
            temp3 = temp3.next;
        }
        if(temp1 != null){
            temp3.next = temp1;
        }else {
            temp3.next = temp2;
        }
        return mergedList.next;
    }
}
