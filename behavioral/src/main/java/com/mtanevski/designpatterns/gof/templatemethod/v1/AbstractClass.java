package com.mtanevski.designpatterns.gof.templatemethod.v1;

public abstract class AbstractClass {
    public final void templateMethod() {
        step1();
        step2();
        step3();
        step4();
    }

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();

    public void step4(){
        System.out.println("Abstract Class - execute step4");
    }
}
