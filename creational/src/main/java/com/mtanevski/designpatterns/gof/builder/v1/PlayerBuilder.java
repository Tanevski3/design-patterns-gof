package com.mtanevski.designpatterns.gof.builder.v1;

import java.util.Collections;

public class PlayerBuilder {

    private final Player player;

    private PlayerBuilder(Player player) {
        this.player = player;
    }

    public static PlayerBuilder newPlayer(){
        return new PlayerBuilder(new Player());
    }

    public PlayerBuilder withNoAttributes() {
        this.player.setHealth(0.0);
        this.player.setMana(0.0);
        this.player.setAttribute(new Attribute());
        return this;
    }

    public PlayerBuilder withNoItems(){
        this.player.setItems(Collections.emptyList());
        return this;
    }

    Player build() {
        return this.player;
    }
}
