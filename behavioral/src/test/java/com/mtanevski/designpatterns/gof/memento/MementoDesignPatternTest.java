package com.mtanevski.designpatterns.gof.memento;

import org.junit.Test;

public class MementoDesignPatternTest {

    @Test
    public void testMementoDesignPattern(){
        Editor editor = new Editor();
        editor.setText("test");
        Command command = new Command(editor);
        command.makeBackup();
        command.undo();
    }
}
