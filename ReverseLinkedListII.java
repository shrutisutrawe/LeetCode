package Leetcode;

public class ReverseLinkedListII {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode front = head;
        ListNode back = null;
        int count = 1;
        ListNode tempResult = null;
        while(front != null){
            if(count == left){
                break;
            }
            back = front;
            front = front.next;
            count++;
        }
        if(count == right){
            return head;
        }
        tempResult = front;
        ListNode tempNode = tempResult;
        while(tempNode != null && count < right){
            tempNode = tempNode.next;
            count++;
        }

        ListNode endList = tempNode.next;
        tempNode.next = null;
        ListNode reversedList = reverse(tempResult);
        if(back == null && endList == null){
            return reversedList;
        }
        if(back == null){
            back = reversedList;
            head = back;
        }else {
            back.next = reversedList;
        }
        ListNode reverseNode = back;
        while(reverseNode.next != null){
            reverseNode = reverseNode.next;
        }
        if(endList == null){
            return head;
        }
        reverseNode.next = endList;
        return head;
    }
    public static ListNode reverse(ListNode head){
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
