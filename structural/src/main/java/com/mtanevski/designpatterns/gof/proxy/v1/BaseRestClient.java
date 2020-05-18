package com.mtanevski.designpatterns.gof.proxy.v1;

public interface BaseRestClient {

    String get(String url);
    String put(String url);
    String post(String url);
    String delete(String url);
}
