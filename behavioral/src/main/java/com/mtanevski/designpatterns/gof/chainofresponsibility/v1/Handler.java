package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public interface Handler {
    Response handle(Request request);
}
