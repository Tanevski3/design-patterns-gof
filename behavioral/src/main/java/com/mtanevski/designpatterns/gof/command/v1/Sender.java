package com.mtanevski.designpatterns.gof.command.v1;

import java.util.*;

public class Sender {

    private Map<String, AbstractCommand> eventHandlers = new HashMap<>();
    private Stack<AbstractCommand> history = new Stack<AbstractCommand>();

    public Sender fire(String event) {
        AbstractCommand command = eventHandlers.get(event);
        command.execute();
        history.push(command);
        return this;
    }

    public Sender undo() {
        AbstractCommand command = history.pop();
        command.undo();
        return this;
    }

    public void on(String key, AbstractCommand value) {
        eventHandlers.put(key, value);
    }
}
