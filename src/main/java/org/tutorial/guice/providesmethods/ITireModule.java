package org.tutorial.guice.providesmethods;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class ITireModule extends AbstractModule {

    @Override
    protected void configure() {
    }

    @Provides
    ITire provideTire() {
        CarTire tire = new CarTire();
        tire.setPressure(2.4f);
        return tire;
    }

}
