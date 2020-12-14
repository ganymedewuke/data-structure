package com.ganymede.link;

/**
 * 删除链表中等于给定值 val 的所有节点。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 */
public class 移除链表元素虚拟头节点 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     * int val;
     * ListNode next;
     * ListNode(int x) { val = x; }
     * }
     */
    public static ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;

        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return dummyHead.next;
    }


    public static void main(String[] args) {
        // 1->2->6->3->4->5->6

        int[] nums = {1, 2, 6, 3, 4, 5, 6};

        ListNode listNode = new ListNode(nums);

        System.out.println(listNode);

        removeElements(listNode, 6);

        System.out.println(listNode);

    }
}
