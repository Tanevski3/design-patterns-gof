package com.mtanevski.designpatterns.gof.observer.v1;

import java.util.Arrays;

public class BattleSystem {

    public void log(String event, Object... arguments) {
        System.out.println(event + " occurred with following arguments: " + Arrays.toString(arguments));
    }
}
