package exams.LeetCode.task2_add_two_numbers;

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
        System.out.println("inputed lists: ");
        System.out.println("answer: " + Solution.listNodeToInt(listNodeee));


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
        if (l1 == null || l2 == null) return null;
        return intToListNode(listNodeToIntReversed(l1) + listNodeToIntReversed(l2));
    }

    public static int listNodeToIntReversed(ListNode listNode) {
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append(listNode.val);
        String string=""+listNode.val;
        while (listNode.next != null) {
            //stringBuilder.append(listNode.next.val);
            string+=listNode.next.val;
            listNode = listNode.next;

        }
       // stringBuilder.reverse();
       // System.out.println("listnodetointreversed___val->val...: "+Integer.parseInt(stringBuilder.toString()));
        //return Integer.parseInt(stringBuilder.toString());
        return Integer.parseInt(new StringBuilder(string).reverse().toString());
    }

    public static int listNodeToInt(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        //stringBuilder.append(listNode.val);
        String string=String.valueOf(listNode.val);
        while (listNode.next != null) {
            //stringBuilder.append(listNode.next.val);
            string+=listNode.next.val;
            listNode = listNode.next;
        }
       // return Integer.parseInt(stringBuilder.toString());
        return Integer.valueOf(new StringBuilder(string).toString());
    }


    public static ListNode intToListNode(int a) {
        if (a < 10) return new ListNode(a);
        String s = new StringBuilder().append(a).toString();
        //System.out.println(s + ":  okay??");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            //list.add(Integer.parseInt(new String("" + s.charAt(i))));
            list.add(Integer.valueOf(String.valueOf(s.charAt(i))));
        }
        //System.out.println("list: " + list);
        Iterator<Integer> iterator = list.iterator();
        ListNode l1 = new ListNode(iterator.next());
        ListNode l2 = l1;
        while (iterator.hasNext()) {
            if (l1.next == null) {
                l1.next = new ListNode(iterator.next());
                //System.out.println(l1.next.val);
            } else {
                l2 = l2.next;
                l2.next = new ListNode(iterator.next());
            }
        }
        return l1;
    }
}