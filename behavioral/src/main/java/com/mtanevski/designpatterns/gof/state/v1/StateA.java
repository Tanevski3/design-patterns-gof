package com.mtanevski.designpatterns.gof.state.v1;

public class StateA extends State {
    public StateA(StateMachine stateMachine) {
        super(stateMachine);
    }

    @Override
    public void play() {
        System.out.println("Handling state A. Go to State B");
        this.machine.changeState(new StateB(this.machine));
    }
}
