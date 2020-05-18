package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public abstract class Scope implements Lookup {
    public Scope parent;

    public Scope withParent(Scope parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public boolean isVariableDeclared(String variableName) {
        if (parent == null) {
            return false;
        } else {
            return parent.isVariableDeclared(variableName);
        }
    }
}
