package com.mtanevski.designpatterns.gof.builder.v1;

import org.junit.Test;

import java.util.Collections;

import static junit.framework.TestCase.assertEquals;

public class BuilderTest {

    @Test
    public void shouldTestBuilderDesignPattern(){
        Player player = PlayerBuilder.newPlayer().withNoAttributes().withNoItems().build();

        assertEquals(0.0, player.getHealth());
        assertEquals(0.0, player.getMana());
        assertEquals(Collections.emptyList(), player.getItems());
    }
}
