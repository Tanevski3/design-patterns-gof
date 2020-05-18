package com.mtanevski.designpatterns.gof.mediator;

public class Controller implements Mediator {

    private final ComponentA componentA;
    private final ComponentB componentB;

    public Controller(){
        this.componentA = new ComponentA(this);
        this.componentB = new ComponentB(this);
    }

    @Override
    public void notify(String event) {
        System.out.println(event);
        if("buttonClicked".equals(event)){
            this.componentA.test();
            this.componentB.test();
        }

        // write custom logic
    }

    public void handle() {
        this.componentA.deleteItem();

        this.componentB.openSaveDialog();
    }
}
