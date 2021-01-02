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
    public ListNode removeElements(ListNode head, int val, int depth) {
        String depthString = generateDepthString(depth);

        System.out.print(depthString);
        System.out.println("Call : reomve " + val + " in " + head);

        if (head == null) {
            System.out.print(depthString);
            System.out.println("Return : " + head);
            return null;
        }


        ListNode res = removeElements(head.next, val, depth + 1);
        System.out.print(depthString);
        System.out.println("After remove " + val + " : " + res);

        ListNode ret;
        if (head.val == val)
            ret = res;
        else {
            head.next = res;
            ret = head;
        }
        System.out.print(depthString);
        System.out.println("Return : " + head);

        return ret;
    }

    private String generateDepthString(int depth) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

    public static void main(String[] args) {
        // 1->2->6->3->4->5->6
        int[] nums = {1, 2, 6, 3, 4, 5, 6};

        ListNode listNode = new ListNode(nums);

        System.out.println(listNode);

        DelLinkNodeByRec delLinkNodeByRec = new DelLinkNodeByRec();

        delLinkNodeByRec.removeElements(listNode, 6, 0);
        System.out.println(listNode);
    }
}
