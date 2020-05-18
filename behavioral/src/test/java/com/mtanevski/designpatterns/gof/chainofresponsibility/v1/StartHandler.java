package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public class StartHandler extends AbstractHandler {
    @Override
    public Response handle(Request request) {
        return super.handleNext(request);
    }
}
