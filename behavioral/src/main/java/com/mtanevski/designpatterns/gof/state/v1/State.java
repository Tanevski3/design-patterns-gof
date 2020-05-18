package com.mtanevski.designpatterns.gof.state.v1;

public abstract class State {
    protected final StateMachine machine;

    public State(StateMachine stateMachine){
        this.machine = stateMachine;
    }

    public abstract void play();
}
