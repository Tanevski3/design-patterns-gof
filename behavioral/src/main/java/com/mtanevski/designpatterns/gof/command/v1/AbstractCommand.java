package com.mtanevski.designpatterns.gof.command.v1;

public abstract class AbstractCommand {

    protected Receiver receiver;
    protected String context;

    public AbstractCommand(Receiver receiver, String context){
        this.receiver = receiver;
        this.context = context;
    }

    public abstract void execute();
    public abstract void undo();
}
