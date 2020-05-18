package com.mtanevski.designpatterns.gof.chainofresponsibility.v1;

public class EndHandler extends AbstractHandler {
    @Override
    public Response handle(Request request) {
        // do stuff
        System.out.println("EndHandler: " + request.getContent());
        return new DefaultResponse();
    }
}
