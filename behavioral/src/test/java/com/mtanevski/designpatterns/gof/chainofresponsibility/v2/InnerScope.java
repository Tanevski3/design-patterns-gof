package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public class InnerScope extends Scope {
    @Override
    public boolean isVariableDeclared(String variableName) {
        if ("d".equals(variableName)) {
            return true;
        } else {
            return super.isVariableDeclared(variableName);
        }
    }
}
