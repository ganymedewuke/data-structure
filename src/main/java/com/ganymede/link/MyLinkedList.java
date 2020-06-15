package com.ganymede.link;

/**
 * 链表是最基础的动态数据结构
 * 链表的增，删，改，查的时间复杂度都是 O(n)
 * 如果只对链表头进行操作： O(1)
 * 只查链表头的元素： O(1)
 *
 * @param <E>
 */
public class MyLinkedList<E> {

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }

    private Node dummyhead;
    private int size;

    public MyLinkedList() {
        dummyhead = new Node(null, null);
        size = 0;
    }


    /**
     * 获取链表中的元素个数
     *
     * @return
     */
    public int getSize() {
        return size;
    }

    /**
     * 返回链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 在链表的index(0-based)位置添加新的元素e
     * 在链表中不是一个常用的操作，掌握方法与思想
     * O(n/2) = O(n)
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");


        Node prev = dummyhead;
        //prev身后移动，直到index-1的位置
        for (int i = 0; i < index; i++)
            prev = prev.next;

        //方法一
//            Node node = new Node(e);
//            //注意两步的顺序不能变，先操作新增节点的next指向prev.next,pre的next再指向新元素
//            node.next = prev.next;
//            prev.next = node;

        //方法二
        prev.next = new Node(e, prev.next);
        size++;
    }

    /**
     * 在链表头添加新的元素e
     * O(1)
     *
     * @param e
     */
    public void addFirst(E e) {
        add(0, e);
    }

    /**
     * 在链表末尾添加新的元素e
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

    /**
     * 获得链表的第index(0-based)个位置的元素
     * 在链表中不是一个常用的操作，练习用...
     * O(n)
     *
     * @param index
     * @return
     */
    public E get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");

        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.e;
    }

    /**
     * 获得链表的第一个元素
     *
     * @return
     */
    public E getFirst() {
        return get(0);
    }

    /**
     * 获得链表的最后一个元素
     *
     * @return
     */
    public E getLast() {
        return get(size - 1);
    }

    /**
     * 修改链表的第index(0-based)个位置的元素为e
     * 在链表中不是一个常用的操作，练习用...
     * O(n)
     *
     * @param index
     * @param e
     */
    public void set(int index, E e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");

        Node cur = dummyhead.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }

        cur.e = e;
    }

    /**
     * 查找链表中是否有元素e
     * O(n)
     *
     * @param e
     * @return
     */
    public boolean contains(E e) {
        Node cur = dummyhead.next;

        while (cur != null) {
            if (cur.e.equals(e)) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 从链表中删除第index(0-based)个位置的元素，返回删除的元素
     * 在链表中不是一个常用的操作，练习用...
     * O(n/2) = O(n)
     *
     * @param index
     * @return
     */
    public E remove(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Removed failed. Illegal index.");

        Node prev = dummyhead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node retNode = prev.next;
        prev.next = retNode.next;
        retNode.next = null;
        size--;

        return retNode.e;
    }

    /**
     * 从链表中删除第一个元素，返回删除的元素
     * O(1)
     *
     * @return
     */
    public E removeFirst() {
        return remove(0);
    }

    /**
     * 从链表中删除最后一个元素，返回删除的元素
     * O(n)
     *
     * @return
     */
    public E removeLast() {
        return remove(size - 1);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();

        //方法一
//        Node cur = dummyhead.next;
//        while (cur != null) {
//            res.append(cur + "->");
//            cur = cur.next;
//        }

        //方法二
        for (Node cur = dummyhead.next; cur != null; cur = cur.next)
            res.append(cur + "->");

        res.append("NULL");
        return res.toString();
    }
}
