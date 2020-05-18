package com.mtanevski.designpatterns.gof.flyweight.v1;

import java.util.Arrays;

public class FlyweightFactory {
    private Flyweight[] cache;

    public Flyweight getFlyweight(Flyweight repeatingState){
        if(Arrays.asList(cache).contains(repeatingState)){
            return cache[Arrays.asList(cache).indexOf(repeatingState)];
        }

        return new Flyweight(repeatingState);
    }
}
