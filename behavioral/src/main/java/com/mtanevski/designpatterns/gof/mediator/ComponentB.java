package com.mtanevski.designpatterns.gof.mediator;

public class ComponentB {
    private Mediator mediator;

    public ComponentB(Mediator mediator) {
        this.mediator = mediator;
    }

    public void openSaveDialog() {
        mediator.notify("buttonClicked");
    }

    public void test() {
        System.out.println("test from componentB");
    }
}
