package com.mtanevski.designpatterns.gof.command.v1;

public class CopyCommand extends AbstractCommand {

    public CopyCommand(Receiver receiver, String context) {
        super(receiver, context);
    }

    @Override
    public void execute() {
        System.out.println("Copied string");
    }

    @Override
    public void undo() {
        System.out.println("Undo Copy string");
    }
}
