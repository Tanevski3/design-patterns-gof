package com.mtanevski.designpatterns.gof.memento;

public class Command {
    private Editor editor;
    private Snapshot backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    public void makeBackup(){
        backup = editor.createSnapshot();
    }

    public void undo(){
        if(backup != null){
            backup.restore();
        }
    }
}
