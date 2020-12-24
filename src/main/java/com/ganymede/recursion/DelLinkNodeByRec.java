package com.ganymede.recursion;

import com.ganymede.link.ListNode;

public class DelLinkNodeByRec {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;

        head.next = removeElements(head.next, val);
        return head.val == val ? head.next : head;
    }

    public static void main(String[] args) {
        // 1->2->6->3->4->5->6
        int[] nums = {1, 4, 2, 6, 3, 4, 5, 6};

        ListNode listNode = new ListNode(nums);

        System.out.println(listNode);

        removeElements(listNode, 4);
        System.out.println(listNode);
    }
}
