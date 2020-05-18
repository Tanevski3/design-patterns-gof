package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public class MostOuterScope extends Scope {
    @Override
    public boolean isVariableDeclared(String variableName) {
        if ("b".equals(variableName)) {
            return true;
        } else {
            return super.isVariableDeclared(variableName);
        }
    }
}
