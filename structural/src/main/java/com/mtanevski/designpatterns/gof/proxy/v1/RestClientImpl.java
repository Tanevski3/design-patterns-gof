package com.mtanevski.designpatterns.gof.proxy.v1;

public class RestClientImpl implements BaseRestClient {
    @Override
    public String get(String url) {
        System.out.println("Http Request: GET " + url);
        return url;
    }

    @Override
    public String put(String url) {
        System.out.println("Http Request: PUT " + url);
        return url;
    }

    @Override
    public String post(String url) {
        System.out.println("Http Request: POST " + url);
        return url;
    }

    @Override
    public String delete(String url) {
        System.out.println("Http Request: DELETE " + url);
        return url;
    }
}
