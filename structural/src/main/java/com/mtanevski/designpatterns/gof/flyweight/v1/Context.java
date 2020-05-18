package com.mtanevski.designpatterns.gof.flyweight.v1;

public class Context {
    private final FlyweightFactory flyweightFactory  = new FlyweightFactory();;
    private UniqueState uniqueState;
    private Flyweight repeatingState;

    public Context(UniqueState uniqueState, Flyweight repeatingState) {
        this.uniqueState = uniqueState;
        this.repeatingState = flyweightFactory.getFlyweight(repeatingState);
    }

    public void operation() {
        this.repeatingState.operation(this.uniqueState);
    }
}
