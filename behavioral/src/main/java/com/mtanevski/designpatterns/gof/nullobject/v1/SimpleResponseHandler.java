package com.mtanevski.designpatterns.gof.nullobject.v1;

public class SimpleResponseHandler implements ResponseHandler {

    @Override
    public Response getResponse(String request) {
        if (null == request) {
            return new EmptyResponse();
        } else if (!"test".equals(request)) {
            return new BadRequestResponse();
        }

        return new OkResponse();
    }
}
