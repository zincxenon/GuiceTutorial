package org.tutorial.guice.providerbindings;

import com.google.inject.Provider;

public class ITireProvider implements Provider<ITire> {

    @Override
    public ITire get() {
        CarTire tire = new CarTire();
        tire.setPressure(2.4f);
        return tire;
    }

}
