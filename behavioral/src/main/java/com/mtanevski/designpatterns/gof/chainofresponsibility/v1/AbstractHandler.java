package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public abstract class AbstractHandler implements Handler {

    private AbstractHandler next;

    protected Response handleNext(Request request) {
        return next.handle(request);
    }

    public AbstractHandler withNext(AbstractHandler handler){
        this.next = handler;
        return next;
    }

    public abstract Response handle(Request request);
}
