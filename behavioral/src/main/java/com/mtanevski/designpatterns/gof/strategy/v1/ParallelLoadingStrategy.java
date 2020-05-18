package com.mtanevski.designpatterns.gof.strategy.v1;

import java.util.Map;

public class ParallelLoadingStrategy implements LoadingStrategy {
    @Override
    public void loadAssets(Map<String, String> assets) {
        System.out.println("Loading assets using parallel loading strategy");
    }
}
