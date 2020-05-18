package com.mtanevski.designpatterns.gof.strategy.v1;

import java.util.Map;

public class SerialLoadingStrategy implements LoadingStrategy {
    @Override
    public void loadAssets(Map<String, String> assets) {
        System.out.println("Loading assets using serial loading strategy");
    }
}
