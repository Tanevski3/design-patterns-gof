package com.mtanevski.designpatterns.gof.state.v1;

public class StateB extends State{
    public StateB(StateMachine machine) {
        super(machine);
    }

    @Override
    public void play() {
        System.out.println("Handling State B. Go to State C");
        machine.changeState(new StateC(machine));
    }

}
