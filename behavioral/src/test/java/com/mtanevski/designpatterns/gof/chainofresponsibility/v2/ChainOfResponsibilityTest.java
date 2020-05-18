package com.mtanevski.designpatterns.gof.chainofresponsibility.v2;

import com.mtanevski.designpatterns.gof.chainofresponsibility.v1.*;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.SimpleTimeZone;

import static org.junit.Assert.*;

public class ChainOfResponsibilityTest {

    @Test
    public void shouldChainResponsibilities() {
        // declare responsibility handlers & chain handlers
        // then
        ScopeManager scopeManager = new ScopeManager();

        // when
        GlobalScope scope = new GlobalScope();
        scopeManager.add(scope);
        MostOuterScope mostOuterScope = new MostOuterScope();
        scopeManager.add(mostOuterScope);
        MiddleScope middleScope = new MiddleScope();
        scopeManager.add(middleScope);
        InnerScope innerScope = new InnerScope();
        scopeManager.add(innerScope);
        MostInnerScope mostInnerScope = new MostInnerScope();
        scopeManager.add(mostInnerScope);

        // then
        boolean isFDeclared = scopeManager.lookupVariable("f");
        assertFalse(isFDeclared);

        boolean isADeclared = scopeManager.lookupVariable("a");
        boolean isBDeclared = scopeManager.lookupVariable("b");
        boolean isCDeclared = scopeManager.lookupVariable("c");
        boolean isDDeclared = scopeManager.lookupVariable("d");
        boolean isEDeclared = scopeManager.lookupVariable("e");
        assertTrue(isADeclared);
        assertTrue(isBDeclared);
        assertTrue(isCDeclared);
        assertTrue(isDDeclared);
        assertTrue(isEDeclared);

        assertTrue(scopeManager.lookupVariable(0, "a"));
        assertFalse(scopeManager.lookupVariable(0, "b"));
        assertFalse(scopeManager.lookupVariable(0, "c"));
        assertFalse(scopeManager.lookupVariable(0, "d"));
        assertFalse(scopeManager.lookupVariable(0, "e"));

        assertTrue(scopeManager.lookupVariable(1, "a"));
        assertTrue(scopeManager.lookupVariable(1, "b"));
        assertFalse(scopeManager.lookupVariable(1, "c"));
        assertFalse(scopeManager.lookupVariable(1, "d"));
        assertFalse(scopeManager.lookupVariable(1, "e"));

        assertTrue(scopeManager.lookupVariable(2, "a"));
        assertTrue(scopeManager.lookupVariable(2, "b"));
        assertTrue(scopeManager.lookupVariable(2, "c"));
        assertFalse(scopeManager.lookupVariable(2, "d"));
        assertFalse(scopeManager.lookupVariable(2, "e"));

        assertTrue(scopeManager.lookupVariable(3, "a"));
        assertTrue(scopeManager.lookupVariable(3, "b"));
        assertTrue(scopeManager.lookupVariable(3, "c"));
        assertTrue(scopeManager.lookupVariable(3, "d"));
        assertFalse(scopeManager.lookupVariable(3, "e"));

        assertTrue(scopeManager.lookupVariable(4, "a"));
        assertTrue(scopeManager.lookupVariable(4, "b"));
        assertTrue(scopeManager.lookupVariable(4, "c"));
        assertTrue(scopeManager.lookupVariable(4, "d"));
        assertTrue(scopeManager.lookupVariable(4, "e"));
    }
}
