package com.mtanevski.designpatterns.gof.visitor.v1;

public class Book implements Element {

    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getCost() {
        return 15;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
