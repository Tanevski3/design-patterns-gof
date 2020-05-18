package com.mtanevski.designpatterns.gof.abstractfactory.v1;

public class Expansion1CharacterFactory implements Factory {
    @Override
    public Character create(CharacterType characterType) {
        switch (characterType){
            case NPC:
                return new Npc(10,10);
            case ENEMY:
                return new Enemy(10, 10);
            case PLAYER:
                return new Player(100, 100);
            default:
                throw new IllegalArgumentException("character type not supported");
        }
    }
}
