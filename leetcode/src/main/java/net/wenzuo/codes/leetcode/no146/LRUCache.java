package net.wenzuo.codes.leetcode.no146;

import java.util.HashMap;

/**
 * 146. LRU 缓存
 * https://leetcode.cn/problems/lru-cache/
 *
 * @author Catch
 * @since 2023-03-11
 */
class LRUCache extends HashMap<Integer, LRUCache.Node> {

    private int capacity;
    private Node head;
    private Node tail;

    LRUCache(int capacity) {
        super(capacity);
        this.capacity = capacity;
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    int get(int key) {
        Node node = super.get(key);
        if (node == null) {
            return -1;
        }
        remove(node);
        addLast(node);
        return node.value;
    }

    void put(int key, int value) {
        if (super.containsKey(key)) {
            Node node = super.get(key);
            node.value = value;
            remove(node);
            addLast(node);
            return;
        }
        Node node = new Node(key, value);
        super.put(key, node);
        addLast(node);
        if (super.size() > capacity) {
            Node n = head.next;
            remove(n);
            super.remove(n.key);
        }
    }

    private void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addLast(Node node) {
        node.prev = tail.prev;
        node.next = tail;
        tail.prev.next = node;
        tail.prev = node;
    }

    static class Node {

        private int key;
        private int value;
        private Node prev;
        private Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }

    }

}
