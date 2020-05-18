package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public class ConsoleHandler extends AbstractHandler {
    @Override
    public Response handle(Request request) {
        // do stuff
        System.out.println("ConsoleHandler: " + request.getContent());
        return super.handleNext(request);
    }
}
