package com.mtanevski.designpatterns.gof.abstractfactory.v1;

public class Expansion2CharacterFactory implements Factory {
    @Override
    public Character create(CharacterType characterType) {
        switch (characterType){
            case NPC:
                return new Npc(100,100);
            case ENEMY:
                return new Enemy(100, 100);
            case PLAYER:
                return new Player(1000, 1000);
            default:
                throw new IllegalArgumentException("character type not supported");
        }
    }
}
