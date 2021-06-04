package Leetcode;
import java.util.*;

public class Add2NumberII {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        Stack<Integer> myStack1  = new Stack<>();
        Stack<Integer> myStack2  = new Stack<>();
        Stack<Integer> outStack  = new Stack<>();
        ListNode temp1 = l1;
        while(temp1 != null){
            myStack1.push(temp1.val);
            temp1 = temp1.next;
        }
        System.out.println(myStack1);
        temp1 = l2;
        while(temp1 != null){
            myStack2.push(temp1.val);
            temp1 = temp1.next;
        }
        System.out.println(myStack2);
        int sum =0, carry=0;
        while(!myStack1.isEmpty() || !myStack2.isEmpty()){
            int num1 = myStack1.isEmpty() ? 0 : myStack1.pop();
            int num2 = myStack2.isEmpty() ? 0 : myStack2.pop();
            sum = carry+num1+num2;
            carry = sum/10;
            sum = sum%10;
            outStack.push(sum);
        }
        System.out.println(outStack);
        if(carry !=0){
            outStack.push(carry);
        }
        ListNode result = new ListNode(-1);
        ListNode tempResult = result;
        while(!outStack.isEmpty()){
            if(tempResult.val < 0){
                tempResult.val = outStack.pop();
//                tempResult.next = null;
            }else{
                tempResult.next = new ListNode(outStack.pop());
                tempResult = tempResult.next;
            }
        }
        return result;
    }
}
