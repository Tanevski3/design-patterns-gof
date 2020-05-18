package com.mtanevski.designpatterns.gof.state;

import com.mtanevski.designpatterns.gof.state.v1.StateMachine;
import org.junit.Test;

public class StatePatternTest {

    @Test
    public void shouldTestStatePattern() {
        StateMachine stateMachine = new StateMachine();

        for(int i = 0; i < 3; i++) {
            stateMachine.play();
        }
    }
}
