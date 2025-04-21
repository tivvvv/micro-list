package com.tiv.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListTest {

    @Test
    void testList() {
        //List<String> list = new MyArrayList<>();
        List<String> list = new MyLinkedList<>();
        for (int i = 0; i < 20; i++) {
            list.add(String.valueOf(i));
        }
        assertEquals(20, list.size());
        list.remove(4);
        list.remove("18");
        assertEquals(18, list.size());
        assertEquals("5", list.get(4));
        assertEquals("19", list.get(17));
        list.forEach(System.out::println);
    }
}
