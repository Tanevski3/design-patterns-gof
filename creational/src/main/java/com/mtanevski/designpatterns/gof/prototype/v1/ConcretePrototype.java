package com.mtanevski.designpatterns.gof.prototype.v1;

public class ConcretePrototype implements Prototype {
    private final String field1;

    public ConcretePrototype(String field1) {
        this.field1 = field1;
    }

    public ConcretePrototype clone() {
        return new ConcretePrototype(this.field1);
    }
}
