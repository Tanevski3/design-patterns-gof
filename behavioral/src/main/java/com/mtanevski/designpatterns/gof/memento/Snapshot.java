package com.mtanevski.designpatterns.gof.memento;

public class Snapshot {
    private Editor editor;
    private String text;
    private Integer curX, curY, selectionWidth;

    public Snapshot(Editor editor, String text, Integer curX, Integer curY, Integer selectionWidth) {
        this.editor = editor;
        this.text = text;
        this.curX = curX;
        this.curY = curY;
        this.selectionWidth = selectionWidth;
    }

    public void restore(){
        editor.setText(text);
        editor.setCurX(curX);
        editor.setCurY(curY);
        editor.setSelectionWidth(selectionWidth);
    }
}
