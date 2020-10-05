package com.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyStackTest {

    @Test
    public void testPush(){

        MyStack newlist = new MyStack();

        assertTrue(newlist.push(10));
        assertTrue(newlist.push(20));
        assertTrue(newlist.push(30));
        assertTrue(newlist.push(40));

        assertEquals(newlist.top, 3);
        assertTrue(newlist.top == 3);
        assertEquals(newlist.peek(), 40);
    }

    @Test
    public void testisEmpty(){

        MyStack newlist = new MyStack();

        assertTrue(newlist.isEmpty());

        newlist.push(10);
        newlist.push(20);
        assertFalse(newlist.isEmpty());

        newlist.pop();
        newlist.pop();
        assertTrue(newlist.isEmpty());
    }

    @Test
    public void testPop(){

        MyStack newlist = new MyStack();

        newlist.push(10);
        newlist.push(20);

        assertTrue(newlist.pop() == 20);
        assertEquals(newlist.pop(), 10);
    }

    @Test
    public void testPeek(){

        MyStack newlist = new MyStack();

        newlist.push(10);
        newlist.push(20);

        assertTrue(newlist.peek() == 20);

        newlist.pop();
        assertEquals(newlist.peek(), 10);
    }


}
