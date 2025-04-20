package com.tiv.list;

import java.util.Iterator;
import java.util.Objects;

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
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E removed = (E) table[index];
        System.arraycopy(table, index + 1, table, index, size - index - 1);
        size--;
        table[size] = null;
        return removed;
    }

    @Override
    public boolean remove(E e) {
        for (int i = 0; i < size; i++) {
            if (Objects.equals(e, table[i])) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        E old = (E) table[index];
        table[index] = e;
        return old;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return (E) table[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
