package com.tiv.list;

import java.util.Iterator;

public class MyLinkedList<E> implements List<E> {

    private int size;

    private Node<E> head;

    private Node<E> tail;

    @Override
    public void add(E e) {
        Node<E> node = new Node<>(tail, null, e);
        if (tail != null) {
            tail.next = node;
        } else {
            head = node;
        }
        tail = node;
        size++;
    }

    @Override
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == size) {
            add(e);
            return;
        }
        Node<E> indexNode = findNode(index);
        Node<E> node = new Node<>(indexNode.pre, indexNode, e);
        if (indexNode.pre == null) {
            head = node;
        } else {
            indexNode.pre.next = node;
        }
        indexNode.pre = node;
        size++;
    }

    private Node<E> findNode(int index) {
        Node<E> result = null;
        if (index < size / 2) {
            result = head;
            for (int i = 0; i < index; i++) {
                result = result.next;
            }
        } else {
            result = tail;
            for (int i = size - 1; i > index; i--) {
                result = result.pre;
            }
        }
        return result;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public E set(int index, E e) {
        return null;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    class Node<E> {

        Node<E> pre;
        Node<E> next;
        E value;

        public Node(E value) {
            this.value = value;
        }

        public Node(Node<E> pre, Node<E> next, E value) {
            this.pre = pre;
            this.next = next;
            this.value = value;
        }
    }
}
