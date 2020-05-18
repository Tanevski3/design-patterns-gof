package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

import java.util.ArrayList;
import java.util.List;

public class ScopeManager {
    private List<Scope> scopes = new ArrayList<>();

    public boolean lookupVariable(String variableName) {
        Scope scope = this.scopes.stream().reduce((acc, curr) -> curr.withParent(acc))
                .orElse(new DefaultScope());
        return scope
                .isVariableDeclared(variableName);
    }

    public boolean lookupVariable(int scopeIndex, String variableName) throws IndexOutOfBoundsException {
        return this.scopes.get(scopeIndex).isVariableDeclared(variableName);
    }

    public void add(Scope scope) {
        this.scopes.add(scope);
    }
}
