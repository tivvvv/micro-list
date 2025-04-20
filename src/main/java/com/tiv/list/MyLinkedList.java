package com.tiv.list;

import java.util.Iterator;

public class MyLinkedList<E> implements List<E> {

    private int size;

    @Override
    public void add(E e) {

    }

    @Override
    public void add(E e, int index) {

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
    }
}
