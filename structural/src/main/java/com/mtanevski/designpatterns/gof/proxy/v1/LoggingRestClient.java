package com.mtanevski.designpatterns.gof.proxy.v1;

public class LoggingRestClient implements BaseRestClient {
    private final BaseRestClient restClient;

    public LoggingRestClient(BaseRestClient restClient) {
        this.restClient = restClient;
    }

    @Override
    public String get(String url) {
        System.out.println("Extra logging during GET");
        return restClient.get(url + ": logged");
    }

    @Override
    public String put(String url) {
        System.out.println("Extra logging during PUT");
        return url;
    }

    @Override
    public String post(String url) {
        System.out.println("Extra logging during POST");
        return url;
    }

    @Override
    public String delete(String url) {
        System.out.println("Extra logging during DELETE");
        return url;
    }
}
