package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

public class GlobalScope extends Scope {
    @Override
    public boolean isVariableDeclared(String variableName) {
        if("a".equals(variableName)){
            return true;
        }
        else {
            return super.isVariableDeclared(variableName);
        }
    }
}
