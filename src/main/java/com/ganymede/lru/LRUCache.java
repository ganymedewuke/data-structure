package com.ganymede.lru;

import java.util.HashMap;

/**
 * 基于双向循环链表实现LRU算法
 * 最近最少使用策略 LRU（Least Recently Used）
 * <p>
 * 先进先出策略 FIFO（First In，First Out）
 * 最少使用策略 LFU（Least Frequently Used）
 * <p>
 * 为LRU（最近最少使用）缓存策略设计一个数据结构，支持以下操作：
 * <p>
 * LRUCache(int capacity) : 初始化
 * int get(int key) 获取数据: 如果缓存中存在key，则获取其数据值，否则返回-1。
 * void put(int key, value) 写入数据: 如果key还没有在缓存中，则写入其数据值。当缓存达到上限，它应该在写入新数据之前删除最近最少使用的数据用来腾出空闲位置。
 * 所有操作在O(1)时间内完成
 */
public class LRUCache {
    int capacity;
    HashMap<String, Node> map;
    List list;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        list = new List();
    }

    public int get(String key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        Node node = map.get(key);

        /**
         * 将对应节点更新为最近访问的数据
         * 实际操作等价于，将原节点从旧的位置删除，重新插入到第一位（head之后）
         */
        list.remove(node);
        list.add(node);
        return node.val;
    }

    /**
     * 为了在O(1)时间内删除最后一个节点，我们需要利用双链表的tail指针
     *
     * @param key
     * @param value
     */
    public void put(String key, int value) {
        if (map.containsKey(key)) {
            list.remove(map.get(key));
            map.remove(key);
        }

        Node node = new Node(key, value);
        map.put(key, node);
        list.add(node);

        if (map.size() > capacity) {
            Node last = list.tail.prev;
            list.remove(last);
            map.remove(last.key);
        }
    }

    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(3);
        lruCache.put("a", 1);
        lruCache.put("b", 1);
        lruCache.put("c", 1);
        lruCache.put("d", 1);
        lruCache.put("e", 1);
        lruCache.put("f", 1);
        lruCache.put("g", 1);

        System.out.println(lruCache);
        lruCache.get("e");

        lruCache.put("h", 1);
        lruCache.put("i", 1);

        System.out.println(lruCache);


//        int val = lruCache.get("a");
//        System.out.println(val);
    }

    @Override
    public String toString() {
        return "LRUCache{" +
                "capacity=" + capacity +
                ", map=" + map +
                ", list=" + list +
                '}';
    }
}

/**
 * 定义Node作为链表的基本元素，用于保存数据
 */
class Node {
    String key;
    int val;
    Node prev, next;

    Node(String k, int v) {
        key = k;
        val = v;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key='" + key + '\'' +
                ", val=" + val +
                '}';
    }
}

class List {
    Node head, tail;

    /**
     * 建立双链表
     */
    List() {
        head = new Node("0", 0);
        tail = new Node("0", 0);
        head.next = tail;
        tail.prev = head;
    }

    /**
     * 提供删除节点的API
     *
     * @param node
     */
    public void remove(Node node) {
        Node prev = node.prev;
        Node next = node.next;
        prev.next = next;
        next.prev = prev;
    }

    /**
     * 提供添加节点的API
     *
     * @param node
     */
    public void add(Node node) {
        Node next = head.next;
        node.prev = head;
        node.next = next;
        head.next = node;
        next.prev = node;
    }

    @Override
    public String toString() {
        String res = "";
        Node node = head.next;
        while (node != null) {
            res += node.key + ":" + node.val + ",";
            node = node.next;
        }

        return res;
    }
}