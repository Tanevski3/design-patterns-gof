package com.mtanevski.designpatterns.gof.state.v1;

public class StateC extends State{
    public StateC(StateMachine machine) {
        super(machine);
    }

    @Override
    public void play() {
        System.out.println("Handling state C. Go To state A");
        machine.changeState(new StateA(machine));
    }

}
