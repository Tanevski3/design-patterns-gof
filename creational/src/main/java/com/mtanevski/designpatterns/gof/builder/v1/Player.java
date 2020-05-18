package com.mtanevski.designpatterns.gof.builder.v1;

import com.mtanevski.designpatterns.gof.abstractfactory.v1.Character;

import java.util.List;

public class Player implements Character {

    private String name;
    private double health;
    private double mana;

    private Attribute attribute;
    private List<Item> items;

    public Player(double health, double mana, Attribute attribute, List<Item> items) {
        this.health = health;
        this.mana = mana;
        this.attribute = attribute;
        this.items = items;
    }

    public Player() {

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

    public Attribute getAttribute() {
        return attribute;
    }

    public void setAttribute(Attribute attribute) {
        this.attribute = attribute;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
