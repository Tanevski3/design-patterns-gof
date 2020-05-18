package com.mtanevski.designpatterns.gof.observer.v1;

import java.util.*;

public class Observable {

    private final Map<String, List<Listener>> listeners = new HashMap<>();

    public final void on(String event, Listener listener) {
        List<Listener> existingListeners = listeners.get(event);
        if(existingListeners != null){
            existingListeners.add(listener);
        } else {
            listeners.put(event, Collections.singletonList(listener));
        }
    }

    public final void off(String event, Listener listener){
        List<Listener> existingListeners = listeners.get(event);
        if(existingListeners != null){
            existingListeners.remove(listener);
        }
    }

    public final void publish(String event, Object... arguments) {
        listeners.entrySet().stream()
                .filter(entry -> event.equals(entry.getKey()))
                .forEach(entry -> entry.getValue().forEach(s -> s.handle(arguments)));
    }

    public final void clearAllListener(){
        listeners.clear();
    }
}
