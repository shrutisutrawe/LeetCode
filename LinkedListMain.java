package Leetcode;

public class LinkedListMain {
    public static void main(String[] args){
        ListNode list = new ListNode();
        int[] array1 = {1,2,3,3,4,4,5,6};
//        int[] array2 = {1,5,6};
        ListNode l1 = list.createList(array1);
        list.printList(l1);
//        ListNode l2 = list.createList(array2);
//        list.printList(l2);
//        Add2NumberII add = new Add2NumberII();
//        ListNode result = add.addTwoNumbers(l1,l2);
//        list.printList(result);
//        ReverseLinkedList rev = new ReverseLinkedList();
//        MergeLinkedList merge = new MergeLinkedList();
//        ListNode mergeList = merge.mergeTwoLists(l1,l2);
//        ReverseKNodes rev = new ReverseKNodes();
//        ListNode reverseList = rev.reverseKGroup(l1,3);
//        list.printList(reverseList);
//        PalindromeLinkedList plist = new PalindromeLinkedList();
//        System.out.println(plist.isPalindrome(l1));
//        ReverseLinkedListII rev = new ReverseLinkedListII();
//        ListNode result = rev.reverseBetween(l1,1,2);
//        RemoveElementsLL rem = new RemoveElementsLL();
//        RemoveNthNode rem = new RemoveNthNode();
//        DeleteNNodesAfterMNodes del = new DeleteNNodesAfterMNodes();
        RemoveDuplicates rem = new RemoveDuplicates();
        ListNode result = rem.deleteDuplicates(l1);
        list.printList(result);

    }
}
