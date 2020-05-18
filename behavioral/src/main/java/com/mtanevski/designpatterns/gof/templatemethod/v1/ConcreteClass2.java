package com.mtanevski.designpatterns.gof.templatemethod.v1;

public class ConcreteClass2 extends AbstractClass {
    @Override
    public void step1() {
        System.out.println("ConcreteClass2 - step1");
    }

    @Override
    public void step2() {
        System.out.println("ConcreteClass2 - step2");
    }

    @Override
    public void step3() {
        System.out.println("ConcreteClass2 - step3");
    }

    @Override
    public void step4() {
        System.out.println("ConcreteClass2 - step4");
    }
}
