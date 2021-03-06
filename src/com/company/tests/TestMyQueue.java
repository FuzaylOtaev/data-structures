package com.company.tests;

import com.company.MyQueue;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMyQueue {

    private MyQueue<Integer> queue = new MyQueue<>();

    @Before
    public void setUp() {
        queue.offer(2);
        queue.offer(4);
        queue.offer(3);
        queue.offer(7);
        queue.offer(8);
        queue.offer(22);
        queue.offer(36);
    }

    @Test
    public void testPeek() {
        assertEquals(2, (long) queue.pop());
        assertEquals(4, (long) queue.pop());
        assertEquals(3, (long) queue.pop());
        assertEquals(7, (long) queue.pop());
        assertEquals(8, (long) queue.pop());
        assertEquals(22, (long) queue.pop());
        assertEquals(36, (long) queue.pop());
    }

    @Test
    public void testOffer() {
        queue.offer(111);
        assertEquals(8, queue.size());

        queue.offer(22);
        assertEquals(9, queue.size());
    }
}
