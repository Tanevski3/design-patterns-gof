package com.mtanevski.designpatterns.gof.strategy.v1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class StrategyPatternTest {

    @Test
    public void shouldTestStrategyPattern() {
        Map<String, String> assets = new HashMap<>();
        LoadingStrategy lazyLoadingStrategy = new ParallelLoadingStrategy();
        Loader loader = new Loader(lazyLoadingStrategy);
        loader.load(assets);

        LoadingStrategy eagerLoadingStrategy = new SerialLoadingStrategy();
        loader.setLoadingStrategy(eagerLoadingStrategy);
        loader.load(assets);
    }
}
