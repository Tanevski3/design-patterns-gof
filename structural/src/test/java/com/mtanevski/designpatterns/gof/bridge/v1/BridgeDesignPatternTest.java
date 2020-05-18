package com.mtanevski.designpatterns.gof.bridge.v1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BridgeDesignPatternTest {

    @Test
    public void shouldTestBridgeDesignPattern() {
        // given
        TV tv = new TV();
        AdvancedRemote tvRemote = new AdvancedRemote(tv);
        Radio radio = new Radio();
        AdvancedRemote radioRemote = new AdvancedRemote(radio);

        // when
        tvRemote.mute();
        radioRemote.mute();

        // then
        assertEquals("0,0.0", tvRemote.show());
        assertEquals("0,0.0", radioRemote.show());
    }

}
