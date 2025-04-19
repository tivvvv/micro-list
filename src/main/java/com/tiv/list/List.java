package com.tiv.list;

/**
 * List接口
 *
 * @param <E>
 */
public interface List<E> extends Iterable<E> {

    void add(E e);

    void add(E e, int index);

    E remove(int index);

    boolean remove(E e);

    E set(int index, E e);

    E get(int index);

    int size();
}
