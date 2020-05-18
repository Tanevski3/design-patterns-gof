package com.mtanevski.designpatterns.gof.command.v1;

public class PasteCommand extends AbstractCommand {

    public PasteCommand(Receiver receiver, String context) {
        super(receiver, context);
    }

    @Override
    public void execute() {
        System.out.println("Paste string");
        this.receiver.addString(this.context);
    }

    @Override
    public void undo() {
        System.out.println("Undo Paste string");
        this.receiver.removeString(this.context);
    }
}
