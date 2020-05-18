package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public class DefaultRequest implements Request {
    public String getContent() {
        return "some content";
    }
}
