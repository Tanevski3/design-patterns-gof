package com.mtanevski.designpatterns.gof.mediator;

public class ComponentA {
    private Mediator mediator;

    public ComponentA(Mediator mediator) {
        this.mediator = mediator;
    }

    public void deleteItem() {
        mediator.notify("buttonClicked");
    }

    public void test() {
        System.out.println("test from component A");
    }
}
