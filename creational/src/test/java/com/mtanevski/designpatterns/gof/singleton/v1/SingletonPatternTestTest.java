package com.mtanevski.designpatterns.gof.singleton.v1;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SingletonPatternTestTest {

    @Test
    public void shouldTestSingletonPattern(){
        assertEquals(Database.getInstance(), Database.getInstance());
    }
}