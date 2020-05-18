package com.mtanevski.designpatterns.gof.memento;

public class Editor {
    private String text;
    private Integer curX;
    private Integer curY;
    private Integer selectionWidth;

    public void setText(String text) {
        this.text = text;
    }

    public void setCurX(Integer curX) {
        this.curX = curX;
    }

    public void setCurY(Integer curY) {
        this.curY = curY;
    }

    public void setSelectionWidth(Integer selectionWidth) {
        this.selectionWidth = selectionWidth;
    }

    public Snapshot createSnapshot() {
        return new Snapshot(this, text, curX, curY, selectionWidth);
    }
}
