package com.ganymede.link;

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

    private Node head;
    private int size;

    public MyLinkedList(Node head, int size) {
        this.head = head;
        this.size = size;
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
     * 在链表头添加新的元素e
     *
     * @param e
     */
    public void addFirst(E e) {
        //方法一
//        Node node = new Node(e);
//        node.next = head;
//        head = node;

        //方法二
        head = new Node(e, head);
        size++;
    }

    /**
     * 在链表的index(0-based)位置添加新的元素e
     * 在链表中不是一个常用的操作，掌握方法与思想
     *
     * @param index
     * @param e
     */
    public void add(int index, E e) {
        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Illegal index.");

        if (index == 0)
            addFirst(e);
        else {
            Node prev = head;
            //prev身后移动，直到index-1的位置
            for (int i = 0; i < index - 1; i++)
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
    }

    /**
     * 在链表末尾添加新的元素e
     *
     * @param e
     */
    public void addLast(E e) {
        add(size, e);
    }

}
