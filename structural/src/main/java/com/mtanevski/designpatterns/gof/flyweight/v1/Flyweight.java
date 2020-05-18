package com.mtanevski.designpatterns.gof.flyweight.v1;

public class Flyweight {
    private final Flyweight repeatingState;

    public Flyweight(Flyweight repeatingState) {
        this.repeatingState = repeatingState;
    }

    public void operation(UniqueState uniqueState){
        System.out.println(uniqueState);
        // do operation based on unique state
    }
}
