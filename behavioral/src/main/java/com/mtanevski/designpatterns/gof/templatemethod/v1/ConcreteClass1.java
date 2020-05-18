package com.mtanevski.designpatterns.gof.templatemethod.v1;

public class ConcreteClass1 extends AbstractClass {
    @Override
    public void step1() {
        System.out.println("ConcreteClass1 - execute step1");
    }

    @Override
    public void step2() {
        System.out.println("ConcreteClass1 - execute step2");
    }

    @Override
    public void step3() {
        System.out.println("ConcreteClass1 - execute step3");
    }
}
