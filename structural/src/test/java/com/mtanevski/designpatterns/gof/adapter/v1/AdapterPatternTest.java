package com.mtanevski.designpatterns.gof.adapter.v1;

import org.junit.Test;

public class AdapterPatternTest {

    @Test
    public void shouldTestAdapterDesignPattern() {
        Ui ui = new GameUi();
        BaseGame baseGame = new BaseGame(ui);
        Ui thirdPartyUi = new UiAdapter(new ThirdPartyUi());
        BaseGame anotherGame = new BaseGame(thirdPartyUi);
    }
}
