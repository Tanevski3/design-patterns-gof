package com.mtanevski.designpatterns.gof.strategy.v1;

import java.util.Map;

public interface LoadingStrategy {
    public void loadAssets(Map<String, String> assets);
}
