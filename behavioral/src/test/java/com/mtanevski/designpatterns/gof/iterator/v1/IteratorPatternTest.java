package com.mtanevski.designpatterns.gof.iterator.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class IteratorPatternTest {

    @Test
    public void shouldTestIteratorPattern() {
        IterableCollection<Integer> collection = new ArrayCollection<>(new Integer[]{1, 2, 3, 4, 5});

        Iterator<Integer> iterator = collection.createIterator();

        Integer counter = 1;
        while (iterator.hasMore()) {
            assertEquals(counter, iterator.getNext());
            counter++;
        }

        assertNull(iterator.getNext());

        counter = 1;
        while (iterator.hasMore()) {
            assertEquals(counter, iterator.getNext());
            counter++;
        }
    }
}
