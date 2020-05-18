package com.mtanevski.designpatterns.gof.state.v1;

public class StateMachine {
    private State state;

    public StateMachine() {
        this.state = new StateA(this);
    }

    public void changeState(State state){
        this.state = state;
    }

    public void play() {
        if(this.state != null) {
            this.state.play();
        }
    }
}
