package com.mtanevski.designpatterns.gof.command.v1;

import org.junit.Test;

public class CommandPatternTest {

    @Test
    public void shouldTestCommandPattern() {
        Receiver receiver = new Receiver();
        Sender sender = new Sender();

        final String cutContent = "cut";
        final String copyContent = "copy";
        final String pasteContent = "paste";

        sender.on("cut", new CutCommand(receiver, cutContent));
        sender.on("copy", new CopyCommand(receiver, copyContent));
        sender.on("paste", new PasteCommand(receiver, pasteContent));

        sender.fire("copy").fire("cut").fire("paste").undo().undo().undo();
    }
}
