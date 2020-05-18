package com.mtanevski.designpatterns.gof.abstractfactory.v1;

public class Player implements Character {

    private String name;
    private double health;
    private double mana;

    public Player(double health, double mana) {
        this.health = health;
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getMana() {
        return mana;
    }

    public void setMana(double mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", mana=" + mana +
                '}';
    }
}
