package com.mtanevski.designpatterns.gof.observer.v1;

import org.junit.Test;

public class ObserverPatternTest {

    @Test
    public void shouldTestObserverPattern() {
        Player player = new Player();
        BattleSystem battleSystem = new BattleSystem();

        player.observable.on(PlayerEvent.ATTACK, arguments -> battleSystem.log(PlayerEvent.ATTACK, arguments));
        player.observable.on(PlayerEvent.DAMAGE, arguments -> battleSystem.log(PlayerEvent.DAMAGE, arguments));

        player.attack();
        // ...
        player.takeDamage();
    }
}
