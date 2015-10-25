package org.tutorial.guice.providesmethods;

import javax.inject.Named;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class CarModule extends AbstractModule {

    @Override
    protected void configure() {
    }

    @Provides @CarTireAnnotation
    ITire provideTire1() {
        return createTire();
    }

    @Provides @Named("CarTireName")
    ITire provideTire2() {
        return createTire();
    }

    private ITire createTire() {
        CarTire tire = new CarTire();
        tire.setPressure(2.4f);
        return tire;
    }

}
