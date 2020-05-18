package com.mtanevski.designpatterns.gof.visitor.v1;

public class Fruit implements Element {

    private String name;
    private double sugarLevel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSugarLevel() {
        return sugarLevel;
    }

    public void setSugarLevel(double sugarLevel) {
        this.sugarLevel = sugarLevel;
    }

    public double getCost() {
        return 1;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
