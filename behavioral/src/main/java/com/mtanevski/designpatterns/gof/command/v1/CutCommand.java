package com.mtanevski.designpatterns.gof.command.v1;

public class CutCommand extends AbstractCommand {

    public CutCommand(Receiver receiver, String context) {
        super(receiver, context);
    }

    @Override
    public void execute() {
        System.out.println("Cut string");
        this.receiver.removeString(this.context);
    }

    @Override
    public void undo() {
        System.out.println("Undo Cut string");
        this.receiver.addString(this.context);
    }
}
