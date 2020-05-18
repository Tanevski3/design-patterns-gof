package com.mtanevski.designpatterns.gof.observer.v1;

public class Player {

    public Observable observable = new Observable();
    private int health;
    private int damage;

    public Player() {
        this.health = 1000;
        this.damage = 100;
    }

    public void attack() {
        observable.publish(PlayerEvent.ATTACK, this.damage);
    }

    public void takeDamage() {
        observable.publish(PlayerEvent.DAMAGE, this.health);
    }

}
