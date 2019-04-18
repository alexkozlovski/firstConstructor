package exams.LeetCode.task2_add_two_numbers.goodexample_19ms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RunListNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;


        ListNode listNode11 = new ListNode(5);
        ListNode listNodee22 = new ListNode(6);
        ListNode listNodee33 = new ListNode(4);
        listNode11.next = listNodee22;
        listNodee22.next = listNodee33;
        ListNode listNodeee = new Solution().addTwoNumbers(listNode1, listNode11);



    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int extra = 0;
        ListNode result = null;
        ListNode currNode = null;
        while(l1!=null||l2!=null||extra!=0){
            int temp = 0;
            if(l1!=null){
                temp += l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                temp += l2.val;
                l2=l2.next;
            }
            temp+=extra;
            extra=temp/10;
            ListNode newNode = new ListNode(temp%10);
            if(result==null){
                result=newNode;
                currNode = result;
            }else{
                currNode.next=newNode;
                currNode=newNode;
            }
        }
        return result;
    }
}