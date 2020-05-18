package com.mtanevski.designpatterns.gof.decorator.v1;

public interface DataSource {
    void writeData(String data);
    String readData();
}
