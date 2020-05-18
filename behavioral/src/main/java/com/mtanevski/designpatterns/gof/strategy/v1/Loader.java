package com.mtanevski.designpatterns.gof.strategy.v1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Future;

// context
public class Loader {

    private LoadingStrategy loadingStrategy;

    public Loader(LoadingStrategy loadingStrategy) {
        this.loadingStrategy = loadingStrategy;
    }

    public void setLoadingStrategy(LoadingStrategy loadingStrategy) {
        this.loadingStrategy = loadingStrategy;
    }

    public Future<List<Object>> load(Map<String, String> assets){
        this.loadingStrategy.loadAssets(assets);

        // create objects out of assets
        List<Object> objects = new ArrayList<>();
        return CompletableFuture.completedFuture(objects);
    }


}
