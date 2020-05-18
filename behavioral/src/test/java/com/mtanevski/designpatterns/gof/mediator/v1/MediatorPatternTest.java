package com.mtanevski.designpatterns.gof.mediator.v1;

import com.mtanevski.designpatterns.gof.mediator.ComponentA;
import com.mtanevski.designpatterns.gof.mediator.ComponentB;
import com.mtanevski.designpatterns.gof.mediator.Controller;
import com.mtanevski.designpatterns.gof.mediator.Mediator;
import org.junit.Test;

public class MediatorPatternTest {

    @Test
    public void testMediatorPattern() {
        Controller mediator = new Controller();

        mediator.handle();

    }
}
