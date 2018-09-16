package com.valiksk8;

public class LinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public void add(T t) {
        Node<T> node = new Node<>(t);
        addNode(node);
        size++;
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        return getNode(index).value;
    }

    public void remove(int index) {
        Node<T> node = getNode(index);
        removeNode(node);
        size--;
    }

    public void remove(T t) {
        Node<T> node = getNodeByValue(t);
        removeNode(node);
        size--;
    }

    public Node<T> getNodeByValue(T value) {
        Node<T> node = head;
        Node<T> result = null;

        for (int i = 0; i < size; i++) {
            if (node.value == value) {
                result = node;
                break;
            }
            node = node.next;
        }
        return result;
    }

    private Node<T> getNode(int index) {
        if (index > size - 1 || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> node;
        if (index > size / 2) {
            node = fromTail(size - (index + 1));
        } else {
            node = fromHead(index);
        }
        return node;
    }

    private void removeNode(Node<T> node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private Node<T> fromTail(int index) {
        Node<T> node = tail;
        for (int i = 0; i < index; i++) {
            node = node.prev;
        }
        return node;
    }

    private Node<T> fromHead(int index) {
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    private void addNode(Node<T> node) {

        if (size == 0) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }
    }

    class Node<T> {
        private T value;
        private Node<T> next;
        private Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }
}