package com.mtanevski.designpatterns.gof.composite.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CompositeDesignPatternTest {

    @Test
    public void shouldTestCompositeDesignPattern() {
        // given
        Container stage = new Container("stage");
        Container background = new Container("background");
        background.add(new Dot());
        background.add(new Image());
        background.add(new Dot());
        stage.add(background);

        // when
        String render = stage.render();

        // then
        assertEquals("stage:[background:[Dot,Image,Dot]]", render);
    }
}
