package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public class MostInnerScope extends Scope {
    @Override
    public boolean isVariableDeclared(String variableName) {
        if ("e".equals(variableName)) {
            return true;
        } else {
            return super.isVariableDeclared(variableName);
        }
    }
}
