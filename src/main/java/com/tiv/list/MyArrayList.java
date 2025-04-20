package com.tiv.list;

import java.util.Iterator;

public class MyArrayList<E> implements List<E> {

    private Object[] table = new Object[10];

    private int size = 0;

    @Override
    public void add(E e) {
        if (size == table.length) {
            resize();
        }
        table[size] = e;
        size++;
    }

    private void resize() {
        Object[] newTable = new Object[table.length * 2];
        System.arraycopy(table, 0, newTable, 0, table.length);
        this.table = newTable;
    }

    @Override
    public void add(E e, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == table.length) {
            resize();
        }
        System.arraycopy(table, index, table, index + 1, size - index);
        table[index] = e;
        size++;
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
        return 0;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
