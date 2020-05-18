package com.mtanevski.designpatterns.gof.abstractfactory.v1;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


public class AbstractFactoryTest {

    @Test
    public void shouldTestAbstractFactoryPattern() {
        CharacterFactory test = new CharacterFactory(1);

        Player player = (Player)test.createCharacter(CharacterType.PLAYER);

        assertEquals(100.0, player.getHealth());
        Object obj = new Object(){ String firstName = "Firstname"; double test = 1.0; };
        System.out.println();

    }
}
