package com.mtanevski.designpatterns.gof.abstractfactory.v1;

public class CharacterFactory implements AbstractFactory {
    private Factory factory;

    public CharacterFactory(Factory factory) {
        this.factory = factory;
    }

    public CharacterFactory(int expansion) {
        if(expansion == 2){
            this.factory = new Expansion2CharacterFactory();
        } else {
            this.factory = new Expansion1CharacterFactory();
        }
    }

    public void setFactory(Factory factory) {
        this.factory = factory;
    }

    @Override
    public Character createCharacter(CharacterType characterType) {
        return this.factory.create(characterType);
    }
}
